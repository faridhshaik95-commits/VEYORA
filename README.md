# VEYORA — Travel. Explore. Live.

A polished travel-booking portfolio project with a responsive frontend and a Spring Boot API starter.

## Included
- Responsive VEYORA homepage
- Flights / Hotels / Buses / Trains navigation
- Search form with swap, dates and traveller selector
- Search-results page
- Passenger details + demo booking flow
- My Trips page using localStorage
- Spring Boot REST API starter
- MySQL-ready configuration
- Cleaned placeholder/personal text from the original prototype

## Run frontend
Open `frontend/index.html` in a browser. For best results use VS Code Live Server.

## Run backend
1. Install Java 26 and Maven (or use the Maven wrapper in your existing Spring project).
2. Create MySQL database:
   `CREATE DATABASE veyora;`
3. Edit `backend/src/main/resources/application.properties` and set your MySQL password.
4. From `backend` run:
   `mvn spring-boot:run`
5. Test:
   `GET http://localhost:8080/api/health`
   `GET http://localhost:8080/api/flights?from=Hyderabad&to=Delhi`

## Next production upgrades
- Connect frontend search to `/api/flights`
- Add JPA entities: User, Flight, Booking, Passenger
- Authentication with Spring Security + JWT
- Real payment gateway
- Real flight/hotel provider API
- Admin dashboard
- Database-backed My Trips
- Deploy frontend and backend separately

## LinkedIn
Post 3–4 screenshots or a 20–30 second demo. Mention the problem, features, tech stack and what you learned. Link the GitHub repository and live demo.
