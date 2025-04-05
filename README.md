# Design Patterns Homework – Proxy & Flyweight

This project demonstrates two key structural design patterns — **Proxy Pattern** and **Flyweight Pattern** — implemented in Java using real-life inspired scenarios.

---

## 🔹 1. Proxy Pattern — Real Estate Image Viewer

###  Scenario:
A real estate agency's website allows users to browse property images. Since the images are high-resolution, we need to optimize loading by:

- Showing low-resolution thumbnails instantly
- Loading full-resolution images **only on demand**
- Restricting image upload to **authorized agents only**

###  What was implemented:
- `Image` interface — common operations
- `RealEstateImage` — heavy object for full-resolution images
- `ImageProxy` — lazy-loading wrapper that displays thumbnails and defers full image loading until needed
- `UploadProtectionProxy` — access control that prevents unauthorized users from uploading images

###  Benefits:
- **Performance optimization** through lazy loading
- **Access control** with a simple proxy layer
- Easy extensibility and testability of the image system

---

## 🔹 2. Flyweight Pattern — Map Marker Optimization

###  Scenario:
A map-based application displays thousands of markers (gas stations, restaurants, etc.), all of which share similar style elements (icon, color, label format).

###  What was implemented:
- `MarkerStyle` — shared immutable object representing visual style
- `MarkerStyleFactory` — factory class that ensures styles are reused (Flyweight)
- `MapMarker` — object representing a point on the map with coordinates and a shared style
- Memory tracking: logs how many style objects vs. total markers

###  Benefits:
- **Huge memory savings** by reusing shared style objects
- Simplified rendering logic
- Demonstrates the principle of separating **intrinsic (shared)** and **extrinsic (unique)** state

