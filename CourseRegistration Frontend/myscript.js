function showcourses(){
    fetch("http://localhost:8081/courses")
    .then((Response)=>Response.json())
    .then((courses)=>{
        const datatable = document.getElementById("coursetable")
        courses.forEach(course=>{
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInWeeks}</td>`
            datatable.innerHTML+=row;

        });
    });
}
function showEnrolledStudents(){
    fetch("http://localhost:8081/courses/enrolled")
    .then((Response)=>Response.json())
    .then((students)=>{
        const datatable = document.getElementById("enrolledtable")
        students.forEach(student=>{
            var row = `<tr>
            <td>${student.name}</td>
            <td>${student.emailId}</td>
            <td>${student.courseName}</td>`
            datatable.innerHTML+=row;

        });
    });

}