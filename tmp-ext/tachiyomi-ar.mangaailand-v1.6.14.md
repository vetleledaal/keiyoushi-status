# Extension Validation Report

- Extension: tachiyomi-ar.mangaailand-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7109397520501699498
- Source name: Manga Ai Land
- Source language: ar
- Selected manga input: popular offset 0: Juujika no Rokunin (`.../juujika-no-rokunin.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Juujika no Rokunin (`.../juujika-no-rokunin.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | Usogui (`.../usogui.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Juujika no Rokunin (`.../juujika-no-rokunin.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Juujika no Rokunin (`.../juujika-no-rokunin.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 134 | الفصل 01 - تحول العينة البشرية أي (`.../01_12.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 77 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Juujika no Rokunin, URL=`.../juujika-no-rokunin.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 15/15 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 15/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../67f5d3e7-3d0c-4885-9d4a-7cf57243b084.webp` (image/jpeg, 376773 bytes, 1125x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../juujika-no-rokunin.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../67f5d3e7-3d0c-4885-9d4a-7cf57243b084.webp` (image/jpeg, 155385 bytes, 600x853) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | تراجيدي, تشويق, دراما, شونين, نفسي |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | شون أوروما طالب في الصف السادس، تم تسميته بـ" العينة البشرية أي" من قبل خمسة من زملائه في الفصل تنمروا عليه كثيرا وجعلوه يعيش الجحيم. سلامه الوحيد ...كان مع أخيه الصغير الذي يحبه، ووالديه، اللذان يحمياه .حتى الخمسة وحوش قتلوا عائلته .عندما خسر كل شيء وواجه الجحيم الحقيقي، أمنية مظلمة ولدت بداخل شون لقد ولد من جديد تحت تدريب جده، الذي خدم في وحدة خاصة في الحرب العالمية الثانية. بعد أربعة سنوات، يظهر أمام أعدائه المقدرين<br><br>أسماء أخرى: اسماء اخرى : 十字架のろくにん |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 13 name, chapter 21 name, chapter 24 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 32 name, chapter 34 name, chapter 38 name, chapter 39 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 45 name, chapter 46 name, chapter 48 name, chapter 51 name, chapter 52 name, chapter 56 name, chapter 59 name, chapter 61 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 85 name, chapter 87 name, chapter 89 name, chapter 91 name, chapter 92 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 101 name, chapter 102 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 114 name, chapter 120 name, chapter 125 name |  |  |  |
| chapters | PASS | 134 chapters |  |  |  |
| chapter dates | PASS | 134 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 77 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../EexXdUDWkAEbYXH.jpg` (image/jpeg, 132016 bytes, 612x878) |  |  |  |
