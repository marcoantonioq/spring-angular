import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-todos-crud',
  templateUrl: './todos-crud.component.html',
  styleUrls: ['./todos-crud.component.scss'],
})
export class TodosCrudComponent implements OnInit {
  nome = 'Marco Antônio Queiroz';
  todos = [
    { nome: 'Tarefa 1', realizada: true },
    { nome: 'Tarefa 2', realizada: false },
  ];

  constructor() {}

  ngOnInit(): void {}

  update() {
    this.todos[0].nome = 'Nova Tarefa';
  }
}
