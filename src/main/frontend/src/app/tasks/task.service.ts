import {Http} from "@angular/http";
import "rxjs/add/operator/map";
import {EventEmitter, Injectable} from "@angular/core";
import {Task} from "./task.model";
// import {HttpClient} from "@angular/common/http";

@Injectable()
export class TaskService {

    onTaskAdded = new EventEmitter<Task>();

    // constructor(private http:HttpClient) {
    constructor(private http:Http) {

    }

    getTasks() {
        return this.http.get('/api/tasks').map(response => response.json());
    }

    saveTask(task: Task, checked: boolean) {
        task.completed = checked;
        return this.http.post('/api/tasks/save', task).map(response => response.json());
    }

    addTask(task: Task) {
        return this.http.post('/api/tasks/save', task).map(response => response.json());
    }

}
