export interface IProject{
    id:number,
    name:string,
    description:string,
    startDate:string,
    endDate:string,
    value: number
    employer:IEmployee,
    task:ITask
   
}
export interface ITask{
    taskId:number,
    name:string,
    description:string,
    startDate:string,
    endDate:string,
    employee:string

}
export interface IEmployee{
   employeeId:number,
   name: string,
   lastName: string,
   jobPosition:string,
   salary:number
}

