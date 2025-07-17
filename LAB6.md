### Name: Sian, Adrian Garett
#### Activity: Springboot: Lab 6: Define Your REST API Endpoints

| Resource | HTTP Verb | Resource URL | Use Case |
| :--- | :--- | :--- | :--- |
| **Zoo** | `GET` | `/api/zoo/status` | Get zoo status |
| | `PUT` | `/api/zoo/open` | Open the zoo |
| | `PUT` | `/api/zoo/close` | Close the zoo |
| **Staff** | `POST` | `/api/staff` | Create new staff member |
| | `GET` | `/api/staff` | Get all staff |
| | `GET` | `/api/staff?role={role}` | Get staff by role |
| | `GET` | `/api/staff/{staffId}` | Get staff member by ID |
| | `PUT` | `/api/staff/{staffId}` | Update staff member |
| | `DELETE` | `/api/staff/{staffId}` | Delete staff member |
| **Handler Actions** | `POST` | `/api/handlers/{handlerId}/feed` | Feed an animal |
| | `POST` | `/api/handlers/{handlerId}/exercise` | Exercise an animal |
| | `POST` | `/api/handlers/{handlerId}/examine` | Examine an animal |
| **Veterinarian Actions**| `POST` | `/api/veterinarians/{vetId}/heal` | Heal an animal |
| | `POST` | `/api/veterinarians/{vetId}/lecture` | Start a lecture |
| **Building** | `POST` | `/api/buildings` | Create new building |
| | `GET` | `/api/buildings` | Get all buildings |
| | `GET` | `/api/buildings/{buildingId}`| Get building by ID |
| | `PUT` | `/api/buildings/{buildingId}`| Update building |
| | `DELETE`| `/api/buildings/{buildingId}`| Delete building |
| **Enclosure** | `GET` | `/api/enclosures/{enclosureId}/animals` | Get animals in enclosure |
| | `POST` | `/api/enclosures/{enclosureId}/animals` | Add animal to enclosure |
| **Animal** | `GET` | `/api/animals` | Get all animals |
| | `GET` | `/api/animals?species={species}` | Get animals by species |
| | `GET` | `/api/animals?isHealthy={status}` | Get animals by health status |
| | `GET` | `/api/animals/{animalId}` | Get animal by ID |
| | `PUT` | `/api/animals/{animalId}` | Update animal |
| | `DELETE` | `/api/animals/{animalId}` | Delete animal |
| **Shop** | `GET` | `/api/shops/{shopId}/products` | Get products in shop |
| | `POST` | `/api/shops/{shopId}/purchase` | Purchase item from shop |
| **Ticket** | `POST` | `/api/tickets` | Create new ticket |
| | `GET` | `/api/tickets/{ticketId}` | Get ticket by ID |
| | `POST` | `/api/tickets/validate` | Validate ticket code |
| **Visitor** | `GET` | `/api/visitors` | Get all visitors |
| | `GET` | `/api/visitors/{visitorId}` | Get visitor by ID |
| | `POST` | `/api/visitors/{visitorId}/location` | Update visitor location |
| | `DELETE` | `/api/visitors/{visitorId}` | Remove visitor (on exit) |
