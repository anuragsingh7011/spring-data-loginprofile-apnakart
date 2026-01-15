<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>ApnaKart</title>

<style>
    * {
        box-sizing: border-box;
    }

    body {
        margin: 0;
        font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Arial, sans-serif;
        background-color: #f4f6f8;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        color: #1f2933;
    }

    .container {
        background: #ffffff;
        width: 420px;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 8px 24px rgba(0,0,0,0.08);
        text-align: center;
    }

    .logo {
        font-size: 22px;
        font-weight: 700;
        margin-bottom: 10px;
        color: #111827;
    }

    .subtitle {
        font-size: 14px;
        color: #6b7280;
        margin-bottom: 30px;
    }

    .btn-primary {
        display: inline-block;
        width: 100%;
        padding: 14px 0;
        background-color: #2563eb;
        color: #ffffff;
        text-decoration: none;
        border-radius: 8px;
        font-size: 15px;
        font-weight: 600;
        transition: background-color 0.2s ease;
    }

    .btn-primary:hover {
        background-color: #1e40af;
    }

    footer {
        margin-top: 25px;
        font-size: 12px;
        color: #9ca3af;
    }
</style>
</head>

<body>
    <div class="container">
        <div class="logo">ApnaKart</div>
        <div class="subtitle">
            Simple. Fast. Reliable shopping experience.
        </div>

        <a href="viewProfile" class="btn-primary">
            Continue to Login
        </a>

        <footer>
            © 2026 ApnaKart. All rights reserved.
        </footer>
    </div>
</body>
</html>
