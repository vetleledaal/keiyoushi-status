# Extension Validation Report

- Extension: tachiyomi-en.tapastic-v1.6.4
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5554748812413853237
- Source name: Tapas
- Source language: en
- Selected manga input: popular offset 0: The Little Spy Who Kidnapped the Villain (`.../335435`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Little Spy Who Kidnapped the Villain (`.../335435`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Overgeared (`.../214495`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Leveling Up: Reshaping the World (`.../326881`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | DARISHA/ Princess's Secret Sweetheart (`.../189105`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | The Little Spy Who Kidnapped the Villain (`.../335435`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Little Spy Who Kidnapped the Villain (`.../335435`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Episode 1 (`.../3958118`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 118 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Little Spy Who Kidnapped the Villain, URL=`.../335435` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://story-a.tapas.io/.../eb99aecb-18b1-4c0a-bc30-fce76be39247.png` (image/png, 552375 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../335435` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://us-a.tapas.io/.../eb99aecb-18b1-4c0a-bc30-fce76be39247_z.jpg` (image/jpeg, 139123 bytes, 400x600) |  |  |  |
| details author | PASS | P4M2U, geumdae, BADA-C |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Reborn into a new life, Aisya is raised to be a spy for House Poz. At just 5 years old, she receives her first mission: pose as Duke Krost’s long-lost daughter and infiltrate his duchy. Recognizing the plot, she knows carrying out her orders will end in death. After dying tragically in her last life, Aisya refuses to accept another unhappy end—choosing instead to betray House Poz and side with Duke Krost. But can she outrun her fate and claim the happy life she has been denied in both lives?<br><br>Type: Comic<br><br><br>Original Title: 악당을 납치한 5살 스파이입니다<br><br><br><br>ⓒP4M2U&geumdae&BADA-C/DAON STUDIO<br><br><br><br>Published by TAPAS ENTERTAINMENT 2026<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 118 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://tapas.io/.../info` to `https://tapas.io/.../info` (1 redirects) |  |  |  |
| page load | PASS | `https://us-a.tapas.io/.../76199a28-7750-48d3-81e5-8e82321214d4.png <redacted query values: __token__ and version>` (image/png, 52818 bytes, 940x1084) |  |  |  |
