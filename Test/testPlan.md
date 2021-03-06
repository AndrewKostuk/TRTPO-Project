# План тестирования
 ### Содержание
  1. [Введение](#1)
  2. [Объект тестирования](#2)
  3. [Риски](#4)
  4. [Аспекты тестирования](#5)<br>
  5. [Подходы к тестированию](#6)
  6. [Представление результатов](#7)
  7. [Выводы](#8)
  <a name="1"></a>
 ## 1. Введение
Содержание данного документа описывает план тестирования desktop-приложения "ToDoList". Цель проведения тестирования - проверка приложения в соответствии с SRS.
<a name="2"></a>
 ## 2. Объект тестирования
### 1. Функциональная пригодность
-   #### Функциональная полнота
    Набор функций приложения должен покрывать все возможности, описанные в SRS.
-   #### Функциональная корректность
    Приложение должно выполнять все заявленные функции корректно.
-   #### Функциональная целесообразность.
    Отсутствуют не заявленные функции, которые бы мешали приложению выполнять первоначально поставленные задачи.
### 2. Удобство использования
-   #### Доступность пользовательского интерфейса
    Элементы управления объектами должны быть всегда доступны пользователю
-   #### Актуальность
    Все изменения происходят в режиме реального времени
<a name="3"></a>
## 3. Риски
К рискам можно отнести:
- Если на компьютере пользователя отсутствет JRE, то приложение не запуститмя.
- Скорость работы зависит от вычислительных мощностей компьютера пользователя.
<a name="4"></a>
 ## 4. Аспекты тестирования
В ходе тестирования должна быть проверена реализация основных функций приложения, к которым относятся:  
1. Добавить новую задачу
2. Редактирование задачи
3. Просмотр прогресса
4. Отметка выполненных дел
5. Поиск задач
6. Удаления задач

### Функциональные требования:
#### 1. Добавить новую задачу
Этот вариант использования небходимо протестировать при:
- Вводе корректных данных
- Вводе некорректных данных
- Неполном вводе данных

#### 2. Редактирование задачи
Этот вариант использования небходимо протестировать на возможность изменения данных задачи.

#### 3. Просмотр прогресса
Этот вариант использования небходимо протестировать на возможность автоматического изменения прогресса при:
- добавлении новых задач
- отметке выполненных дел
- удалении задач

#### 4. Отметка выполненных дел
Этот вариант использования небходимо протестировать на возможность изменения статуса задачи при нажатии галочки и изменения прогресса выполнения дел.

#### 5. Поиск задач
Этот вариант использования небходимо протестировать при выборе параметра для поиска и возможность вывода списка подходящих дел.

#### 6. Удаление задач
Этот вариант использования небходимо протестировать на возможность удаления задачи из списка дел для текущего дня и изменения линии прогресса.


### Нефункциональные требования:
#### 1. Понятный интерфейс
Понимание того, за что отвечают кнопки и окна приложения.

#### 2. Производительность
Отсутствие лагов во время использования приложения

<a name="5"></a>
## 5. Подходы к тестированию
Для тестирования приложения необходимо вручную проверить каждый аспект тестирования.

<a name="6"></a>
## 6. Представление результатов
Результаты тестирования представлены в [документе](https://github.com/AndrewKostuk/TRTPO-Project/blob/master/Test/testResults.md).

<a name="7"></a>
## 7. Вывод
Данный тестовый план позволяет протестировать основной функционал приложения. Успешное прохождение всех тестов с высокой вероятностью можно говорить о хорошей работоспособности, и о том, что данное программное обеспечение работает корректно.

    
