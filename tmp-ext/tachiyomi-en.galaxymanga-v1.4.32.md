# Extension Validation Report

- Extension: tachiyomi-en.galaxymanga-v1.4.32
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
- Source ID: 3084421114955435608
- Source name: Galaxy Manga
- Source language: en
- Selected manga input: latest offset 0: My Younger Sister Chooses Me Tonight (`.../my-younger-sister-chooses-me-tonight`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | The Reason Why Raeliana Ended up at the Duke’s Mansion (`.../the-reason-why-raeliana-ended-up-at-the-dukes-mansion`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | My Younger Sister Chooses Me Tonight (`.../my-younger-sister-chooses-me-tonight`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | My Childhood Friends Are trying to Kill Me (`.../my-childhood-friends-are-trying-to-kill-me`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My Younger Sister Chooses Me Tonight (`.../my-younger-sister-chooses-me-tonight`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Younger Sister Chooses Me Tonight (`.../my-younger-sister-chooses-me-tonight`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 68 | Chapter 1 (`.../my-younger-sister-chooses-me-tonight-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Younger Sister Chooses Me Tonight, URL=`.../my-younger-sister-chooses-me-tonight` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://galaxymanga.io/.../image-manga-687cf46517f0d6.26845364-207x300.webp` (image/webp (encoding: lossy), 16702 bytes, 207x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-younger-sister-chooses-me-tonight` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://galaxymanga.io/.../image-manga-687cf46517f0d6.26845364.webp` (image/webp (encoding: lossy), 33752 bytes, 345x500) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Fantasy, Manhwa, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read manhwa My Younger Sister Chooses Me Tonight / 여동생은 오늘 밤 나를 간택한다 Arin, the adopted daughter of a chaebol family, harbours a twisted affection for her stepmother. After she becomes an adult, Arin accidentally realises that she has unusual abilities. She tries to use her abilities to attract her stepmother’s attention, but her stepbrothers, not her stepmother, want Arin… A dangerous adopted daughter who shakes up the conglomerate ‘Rare Moon’ family. Her twisted red romance! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 68 chapters |  |  |  |
| chapter dates | PASS | 68 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dl.galaxymanga.io/.../image1-51764.jpg` (image/jpeg, 500013 bytes, 720x9000) |  |  |  |
