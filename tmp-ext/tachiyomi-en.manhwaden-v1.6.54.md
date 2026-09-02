# Extension Validation Report

- Extension: tachiyomi-en.manhwaden-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7672439791159944710
- Source name: ManhwaDen
- Source language: en
- Selected manga input: popular offset 0: Jinx Season 2 (`.../31093`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Jinx Season 2 (`.../31093`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Boarding Diary (`.../3292`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Codename Anastasia (`.../13957`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | The Bride’s Duty Begins with Her Brothers (`.../47017`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jinx Season 2 (`.../31093`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx Season 2 (`.../31093`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Chapter 54 (`.../chapter-54`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx Season 2, URL=`31093` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.manhwaden.com/.../Jinx-Season-2-110x150.jpg` (image/jpeg, 6106 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `31093` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.manhwaden.com/.../Jinx-Season-2.jpg` (image/jpeg, 14104 bytes, 193x278) |  |  |  |
| details author | PASS | Clarju |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Romance, Slice of life, Smut, Yaoi, Drama, Mature, Medical, Shounen Ai, Sports |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kim Dan, a physical therapist, has been facing financial difficulties due to his ailing grandmother, debts from loan sharks, and a job search impacted by his previous employer. His luck changes when he is hired to treat a well-known MMA fighter, Joo Jaekyung. However, things take a sudden turn when Jaekyung requests a specific treatment the night before his fight and offers Dan a sum of five thousand dollars. Despite being apprehensive due to Jaekyung’s notorious reputation for rough behavior in and out of the ring, Dan agrees to help him overcome a “Jinx.” Will this one fateful night bring a solution to Jaekyung’s struggles?<br><br>Alternative Names: Jinx, Jinx Season 2, 징크스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | LINT | 14 of 50 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=14 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://www.manhwaden.com/.../chapter-54` at pages 37, 38, 39, 40, 41, 42, 43 |  |  |  |
| page load | PASS | `https://manhwamint.com/.../JINX-S2-Chapter-54-01.webp` (image/webp (encoding: lossy), 27410 bytes, 1024x750) |  |  |  |
