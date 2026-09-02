# Extension Validation Report

- Extension: tachiyomi-all.manga18me-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 6244055465910932489
- Source name: Manga18.me
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 21 | My Brother’s Slipped Inside Me in The Bathtub (`.../my-brothers-slipped-inside-me-in-the-bathtub`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Your Mom Is the Best (`.../your-mom-is-the-best`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | BeTwin (Uncensored) (`.../betwin-uncensored`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../secret-class`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../secret-class`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 327 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga18.me/.../secret-class-thumbnail.jpg` (image/jpeg, 16570 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://manga18.me/.../secret-class-thumbnail.jpg` |  |  |  |
| details author | PASS | Minachan |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 
<br>                    Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class… This story is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.                <br>Alternative Names:<br>- Bimilsueop<br>- 비밀 수업<br>- 秘密教學<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 327 chapters |  |  |  |
| chapter dates | PASS | 327 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img-r1.manga18.me/.../1-001.jpg` (image/webp (encoding: lossy), 41812 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
