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
- JavaFX library **for frontend**  

### **Steps to Run**  

1. **Clone the repository:**  
   ```sh
   git clone https://github.com/maditya01/SecretShare.git
   cd SecretShare
   ```  

2. **Set up the database:**  
   - Create a MySQL database:  
     ```sql
     CREATE DATABASE file_sharing;
     ```  


## **How It Works**  

1️⃣ **User registers & logs in** using JWT authentication.  
2️⃣ **Uploads a file**, and the system generates a **unique access key**.  
3️⃣ **Shares the key** with others to grant download access.  
4️⃣ **Receiver enters the key** to download the file.  
5️⃣ **Uploader sets limits** on downloads & file expiry.  

## **Contributing**  

We welcome contributions! Feel free to open an issue or submit a pull request.
