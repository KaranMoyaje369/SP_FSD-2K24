document.addEventListener("DOMContentLoaded", function(){

    const employeeForm = document.getElementById("employeeForm");
    const employeeName = document.getElementById("employeeName");
    const employeeTitle = document.getElementById("employeeTitle");
    const employeeList = document.getElementById("employeeList");
    
    // Load Employee From Local Storage

    function loadEmployee() {
        employeeList.innerHTML = '';
        const employees = JSON.parse(localStorage.getItem("employees")) || [];
       employees.forEach((employee, index) => {
        const row = document.createElement("tr");
        row.innerHTML = `
        <td>${employee.name}</td>
        <td>${employee.title}</td>

        <td>
            <button onclick="editEmployee(${index})">Edit</button>
            <button onclick="deleteEmployee(${index})">Delete</button>
        </td>
        `;

        employeeList.appendChild(row);
       })
    }

    // Add a new employee

    employeeForm.addEventListener("submit",function(e){
        e.preventDefault();

        const newEmployeeName = employeeName.value.trim();
        const newEmployeeTitle = employeeTitle.value.trim();

        if ( newEmployeeName !== "" && newEmployeeTitle !== "") {
            const employees = JSON.parse(localStorage.getItem("employees")) || [];
            const newEmployee = {name : newEmployeeName, title : newEmployeeTitle};
            employees.push(newEmployee);
            localStorage.setItem("employees", JSON.stringify(employees));
            employeeName.value = "";
            employeeTitle.value = "";
            loadEmployee();
        }
    });

    // Edit an Employee

    window.editEmployee = function(index) {
        const employees = JSON.parse(localStorage.getItem("employees")) || [];
        const employee = employees[index];
        const updateName = prompt("Edit Employee Name :", employee.name);
        const updateTitle = prompt("Edit Employee Title :", employee.title);

        if( updateName !== null && updateTitle !== null) {
            employee.name = updateName;
            employee.title = updateTitle;

            localStorage.setItem("employees", JSON.stringify(employees));
            loadEmployee();
        }
    };

    // Delete an Employee

    window.deleteEmployee = function(index) {
        const employees = JSON.parse(localStorage.getItem("employees")) || [];
        employees.splice(index,1);
        localStorage.setItem("employees", JSON.stringify(employees));
        loadEmployee();
    };

    // Initial load of Employee

    loadEmployee();
});