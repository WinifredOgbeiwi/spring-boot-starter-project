# 🚀 Spring Boot Task 1 – Basic Web Application with Controller and View

This project is my first hands-on exercise using **Spring Boot**, where I explored how controllers handle HTTP requests, how to serve HTML pages using **Thymeleaf**, and how REST APIs work.

## 🎯 Objective

- Set up a Spring Boot project from scratch using [start.spring.io](https://start.spring.io)
- Create basic and REST controllers
- Handle HTTP GET requests
- Render HTML views with Thymeleaf
- Practice route mapping and separation of concerns
- Understand how Spring handles static resources (CSS, images)

## ⚙️ Project Setup

- **Build Tool:** Maven  
- **Language:** Java  
- **Packaging:** JAR  
- **Spring Boot Version:** Latest stable  
- **Dependencies:**  
  - Spring Web  
  - Thymeleaf  
  - Lombok  

## ✅ What I Did

1. **Created a HelloController**  
   - Used `@Controller` to serve a basic HTML view.
   - Initially had a route `/` inside a `@RestController`, but I **moved it to a separate controller** to avoid conflicts between `@Controller` and `@RestController`.

2. **Created a ProfileController**  
   - Used `@RestController` to return a JSON response at `/api/profile`.  
   - The controller returns my profile details using `Map.of()`:

3. **Practiced Route Mapping**  
   - Added a new `/profile` route to explore additional mapping options.

4. **Used JSON in HTML (Bonus)**  
   - Experimented with displaying JSON data on an HTML page to better understand frontend-backend interaction.

5. **Applied Separation of Concerns**  
   - Moved all CSS to the `static` folder (outside `templates`) to follow best practices.
   - Learned that Thymeleaf works with CSS only when the files are placed in the `static` directory.
     
6. **Use conditional rendering**
   - used Thymeleaf if else to render a page based on the url parameters

## 🧠 What I Learned

- The difference between `@Controller` and `@RestController`
- How to handle GET requests using `@GetMapping`
- How to return:
  - Plain text with `@ResponseBody`
  - HTML views with Thymeleaf
  - JSON objects via REST endpoints
- How to organize frontend files (HTML, CSS)
- That `static/` is for CSS, JS, images; `templates/` is for Thymeleaf views
- Importance of route separation and clear structure

## 💻 How It Works

1. **Run the application** – Start from IntelliJ or terminal; app runs on `http://localhost:8080`

2. **Visit Routes:**
   - `/` – Shows a greeting HTML page
   - `/api/profile` – Returns a JSON object with profile data
   - `/greeting` - Return a HTML page with a link to another page
   - `/greeting?name=Vistula` - Or any other name: Return a HTML page and utilising the parameter in the URL
   - `/profile` – Return a HTML page with utilising a Json data

3. **Frontend Features:**
   - HTML styled with CSS
   - Displays text and image
   - Fetches and displays JSON data

## 🖼️ Screenshots
____________________________________________


**Author:** Winifred Imade Ogbeiwi  
**School:** Vistula University  
**Track:** Computer Engineering  
