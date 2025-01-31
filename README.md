# **Key-Based File Sharing Desktop App**  

A **secure file-sharing application** that allows users to **upload files**, generate **unique access keys**, and set **download limits and expiration times** for controlled sharing.  

## **Problem Statement**  

Traditional file-sharing methods often come with several challenges:  

- ❌ **Unauthorized Access** – Public links can be misused or accessed by unintended users.  
- ❌ **Limited Control** – Users cannot restrict downloads or set file expiration.  
- ❌ **Complex Sharing** – Manual permissions and account-based access make the process cumbersome.  

## **Solution**  

This application provides a **key-based sharing system** where:  

- ✅ Users **sign up and log in** securely using **JWT authentication**.  
- ✅ Uploaded files get a **unique access key** for controlled sharing.  
- ✅ Only users **with the key** can download the file.  
- ✅ Uploaders can **set download limits** and **expiration times**.  

## **Tech Stack**  

| Component       | Technology Used |
|----------------|----------------|
| **Frontend**   | JavaFX (Desktop UI) |
| **Backend**    | Java |
| **Communication** | Socket Programming |
| **Database**   | MySQL |
| **Authentication** | JWT (JSON Web Token) |

## **Features**  

✔️ **User Authentication** – Secure sign-up and login with JWT.  
✔️ **File Upload & Storage** – Store files securely on the server.  
✔️ **Key-Based Access** – Each file gets a unique key for controlled sharing.  
✔️ **Download Limits** – Restrict the number of downloads per file.  
✔️ **File Expiry** – Set availability duration for files.  
✔️ **Real-Time Communication** – Uses **Socket Programming** for efficient data exchange.  

## **Setup Instructions**  

### **Prerequisites**  

- Java **17+**
- MySQL **installed & running**
- Add MySQL JDBC driver library and  JavaFX jar library.
- Main.java is the starter for the front end, and Server.java is the starter for the backend.  

### **Steps to Run**  

1. **Clone the repository:**  
   ```sh
   git clone https://github.com/maditya01/SecretShare.git
   cd SecretShare
   ```  

2. **Set up the database:**  
   - Create a MySQL database:  
     ```sql
     CREATE DATABASE smartshare;
     ```  


## **How It Works**  

1️⃣ **User registers & logs in** using JWT authentication.  
2️⃣ **Uploads a file**, and the system generates a **unique access key**.  
3️⃣ **Shares the key** with others to grant download access.  
4️⃣ **Receiver enters the key** to download the file.  
5️⃣ **Uploader sets limits** on downloads & file expiry.  

## **Contributing**  

We welcome contributions! Feel free to open an issue or submit a pull request.


## **Screenshots**
![upload](https://github.com/user-attachments/assets/c7d4f1f3-d5b4-481c-bac5-d23dce20c90c)
![signup](https://github.com/user-attachments/assets/161cc174-d1be-4dda-9d15-3d95f5ae38bf)
![login](https://github.com/user-attachments/assets/dec77c04-7405-48d9-8ec6-8eb45429c816)
![home](https://github.com/user-attachments/assets/150dd91f-6908-4a63-9ffb-bc2f1091d724)
![history](https://github.com/user-attachments/assets/8b8fb7e2-3205-4934-8e49-7856e4837a43)
![download](https://github.com/user-attachments/assets/50229d17-f801-46f7-ae73-4ab066699e07)
![AfterloginHome](https://github.com/user-attachments/assets/2370088e-83aa-4f2c-9856-3245319dbf39)

