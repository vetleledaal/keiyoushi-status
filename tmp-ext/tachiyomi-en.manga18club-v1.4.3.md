# Extension Validation Report

- Extension: tachiyomi-en.manga18club-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3436561761894030433
- Source name: Manga18.Club
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Boarding Diary Uncensored (`.../boarding-diary-uncensored`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | I Banged All My Classmates After Graduation (`.../i-banged-all-my-classmates-after-graduation`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The owner of the deserted island Raw (`.../the-owner-of-the-deserted-island-raw`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Secret Class (`.../secret-class`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 328 | Chapter 1 (`.../chap-1`) |  | <1s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manga18.club/.../cover_thumb_2.webp` (image/jpeg, 5970 bytes, 150x200; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.manga18.club/.../cover_250x350.jpg` (image/jpeg, 12888 bytes, 250x350) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-Chan |  |  |  |
| details genres | PASS | Adult, Romance, Drama, Smut, Manhwa, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Secret Class is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.<br><br>Alternative Names:<br>Secret Classes, Secret Class English, 비밀수업, 秘密教學, 全年齡版 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 328 chapters |  |  |  |
| chapter dates | PASS | 328 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manga18.club/.../01.jpg` (image/webp (encoding: lossy), 41812 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
