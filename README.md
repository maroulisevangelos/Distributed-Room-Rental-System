# Distributed-Room-Rental-System
This project implements a distributed room rental system that allows users to manage and book accommodations. The system is built with Java for the backend and an Android application for the frontend. It utilizes a multithreaded architecture, TCP sockets for communication, and distributed MapReduce techniques to ensure scalability and reliability. The project is divided into two phases: backend development and Android application development.

Features:

  Phase A: Backend System and Manager Console Application
  
    Manager Functions: 
    
          Add new accommodations by providing their details in a JSON file and an image.
          
          Specify available dates for renting accommodations.
          
          Display bookings for owned accommodations through a console application.

          
    Search and Booking:
    
      Dummy application enables users to filter accommodations based on:
      
        Area
        
        Dates
        
        Number of persons
        
        Price
        
        Star rating
      
      Allows users to book accommodations after filtering results.
    
    Distributed Backend Architecture:
    
      Master Node:
      
        Multithreaded TCP server.
        
        Manages requests from managers and users.
        
        Distributes accommodation data to worker nodes using a hash function for load balancing.
      
      Worker Nodes:
      
        Multithreaded processing for data storage and handling user requests.
        
        Store data structures in memory for quick access.

  Phase B: Android Application Development
  
    Renter Functions via Android App:
    
      Filter accommodations with criteria like area, dates, price, stars, and occupancy.
      
      Book accommodations asynchronously through a book() function.
      
      Rate accommodations on a scale of 1–5 stars.
    
    Real-Time Communication:
    
      Implements asynchronous communication between the app and Master Node using TCP sockets.
      
      Keeps the application interactive while processing requests in the background.
      
    Manager Aggregation Queries:
    
      Console application supports aggregation queries for total bookings by area and time range.

  Technical Details:
  
    Backend: Java
    
      TCP server for communication.
      
      Multithreading for concurrency.
      
      Synchronized methods for data consistency.
      
      Dynamic worker node assignment.
      
    Frontend: Android application
    
      Socket communication with the backend.
      
      Multithreaded handling of user interactions and data reception.
      
    Data Storage:
    
      JSON files for accommodation details.
      
      Images stored as file paths referenced in JSON.
      
      In-memory data structures for worker nodes.

  Bonus Feature: Active Replication:
  
    Provides fault tolerance by keeping accommodation data synchronized across multiple worker nodes.
    
    Requests are routed to replicas in case of node failures.
    
    Ensures data reliability and uninterrupted user experience.
    
  Execution Instructions:
  
    Backend Setup:
    
      Compile and run the Master Node and Worker Nodes using Java.
      
      Use the console application to manage accommodations and bookings.
    
    Frontend Setup:
    
      Open the Android project in Android Studio.
      
      Run the app on a compatible Android device or emulator.
      
  Deliverables:
    
      Source code for both backend and frontend implementations.
      
      Dummy application for testing backend functionality (Phase A).
      
      Android application (Phase B).
