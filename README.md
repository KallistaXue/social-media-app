# Social Media Application

## Table of Contents

- [Project Description](#project-description)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
- [API Endpoints and Usage](#api-endpoints-and-usage)
- [Libraries and Tools Used](#libraries-and-tools-used)
- [Contributing](#contributing)
- [License](#license)

## Project Description

This is a simplified social media application built for learning and demonstration. This project provides a hands-on implementation of common social media functionalities including user registration, profile management, post creation, commenting, and liking posts. This repository contains the code for a Social Media App API built using Java and PostgreSQL. The API has been tested using Postman.

Functions include:
- Register user account
- Create and manage user profile
- Log in to user account
- Post create, update and delete
- Display a user's posts
- Comment (on a post) create and delete
- Like and unlike (a post)

## Prerequisites

- Java JDK (version 20.0.1)
- PostgreSQL (pgAdmin4)
- IntelliJ IDEA or any Java IDE
- Postman for API testing

## Setup and Installation

1. Clone this repository:
    ```bash
    git clone https://github.com/KallistaXue/social-media-app.git
    ```

2. Navigate into the repository:
    ```bash
    cd social-media-app
    ```

3. Open the project in IntelliJ IDEA or your preferred IDE.

4. Set up PostgreSQL using pgAdmin4 and run the database schema.

5. Build the project and run.

6. Test the API using Postman. 


## API Endpoints and Usage
API (Application Programming Interface) documentation for the social media app, including resources and endpoints design.

### Resources 
- Users
- Posts
- Comments
- Likes

### Endpoints

#### Users

##### 1. Create a user
POST  {{base_url}}/users/user-register

###### Query Parameters
| Name          | Type   | Description                      | 
|---------------|--------|----------------------------------|
| username      | string | The unique username of the user. |
| first name    | string | The first name of the user.      | 
| last name     | string | The last name of the user.       | 
| email         | string | The email address of the user.   | 
| password      | string | The password of the user.        | 
| date of birth | string | format: month-date-year.         | 



##### 2. Log in to user account
POST  {{base_url}}/users/user-login

###### Query Parameters
| Name          | Type   | Description                      |
|---------------|--------|----------------------------------|
| username      | string | The username of the user.        |
| password      | string | The password of the user.        | 

##### 3. Get user information (eg. display user information on a profile page)
GET  {{base_url}}/users/user-info/{user_id}

###### Path Variables
| Name    | Type | Description          | 
|---------|------|----------------------|
| user_id | int  | The ID of the user.  |

##### 4. Update user information (can apply partial updates)
PUT  {{base_url}}/users/user-update/{user_id}

###### Path Variables
| Name    | Type | Description          | 
|---------|------|----------------------|
| user_id | int  | The ID of the user.  |

###### Query Parameters
| Name          | Type   | Description                      | 
|---------------|--------|----------------------------------|
| username      | string | The unique username of the user. | 
| first name    | string | The first name of the user.      | 
| last name     | string | The last name of the user.       | 
| email         | string | The email address of the user.   |
| password      | string | The password of the user.        |
| date of birth | string | format: month-date-year.         | 

##### 5. Delete a user
DELETE  {{base_url}}/users/user-delete/{user_id}

###### Path Variables
| Name    | Type | Description          | 
|---------|------|----------------------|
| user_id | int  | The ID of the user.  | 



#### Posts

##### 1. Create a post
POST  {{base_url}}/posts/post-create

###### Query Parameters
| Name    | Type   | Description                      | 
|---------|--------|----------------------------------|
| user_id | int    | The ID of the user who posts.    |
| content | string | The content of the post.         | 

##### 2. Get a post (post display)
GET  {{base_url}}/posts/post-info/{post_id}

###### Path Variables
| Name    | Type | Description          | 
|---------|------|----------------------|
| post_id | int  | The ID of the post.  | 

##### 3. Update post content
PUT  {{base_url}}/posts/post-update/{post_id}

###### Path Variables
| Name    | Type | Description          | 
|---------|------|----------------------|
| post_id | int  | The ID of the post.  |
###### Query Parameters
| Name    | Type   | Description               | 
|---------|--------|---------------------------|
| content | string | The updated post content. |

##### 4. Delete a post
DELETE  {{base_url}}/posts/post-delete/{post_id}

###### Path Variables
| Name    | Type | Description          | 
|---------|------|----------------------|
| post_id | int  | The ID of the post.  |



#### Comments

##### 1. Create a comment under a post
POST  {{base_url}}/comments/comment-create

###### Query Parameters
| Name    | Type   | Description                      |
|---------|--------|----------------------------------|
| content | string | The content of the comment.      |
| user_id | int    | The ID of the user who comments. | 
| post_id | int    | The ID of the post.              | 

##### 2. Get a comment (comment display)
GET  {{base_url}}/comments/comment-info/{comment_id}

###### Path Variables
| Name       | Type | Description           | 
|------------|------|-----------------------|
| comment_id | int  | The ID of the comment.| 

##### 3. Delete a comment
DELETE  {{base_url}}/comments/comment-delete/{comment_id}

###### Path Variables
| Name       | Type | Description           | 
|------------|------|-----------------------|
| comment_id | int  | The ID of the comment.| 



#### Likes

##### 1. Create a like (like a post)
POST  {{base_url}}/likes/like-create

###### Query Parameters
| Name    | Type | Description         | 
|---------|------|---------------------|
| user_id | int  | The ID of the user. | 
| post_id | int  | The ID of the post. |

##### 2. Get a like (like display)
GET  {{base_url}}/likes/like-info/{like_id}

###### Path Variables
| Name    | Type | Description           | 
|---------|------|-----------------------|
| like_id | int  | The ID of the like.   | 

##### 3. Delete a like (unlike a post)
DELETE  {{base_url}}/likes/like-delete/{like_id}

###### Path Variables
| Name    | Type | Description           |
|---------|------|-----------------------|
| like_id | int  | The ID of the like.   | 

## Libraries and Tools Used

- Java
- PostgreSQL (pgAdmin4)
- IntelliJ IDEA
- Postman

## Contributing

If you would like to contribute to this project, please follow these steps:

1. Fork the repository
2. Create a new branch 
```
git checkout -b new-feature
```
3. Make your changes
4. Commit your changes 
```
git commit -m 'Add some feature'
```

5. Push to the branch 
```
git push origin new-feature
```
6. Create a new Pull Request


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.