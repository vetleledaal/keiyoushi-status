# Extension Validation Report

- Extension: tachiyomi-ja.rawuwu-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2270841189174019045
- Source name: Raw UwU
- Source language: ja
- Selected manga input: latest offset 0: Kirawaremono no Akuyaku Reisoku ni Tensei shita no ni, Naze ka Mawari ga Hanatte Oite Kurenai (`.../858515`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Number 1 striker (`.../579`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Dare demo Dakeru Kimi ga Suki  (`.../779293`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 40 | Kirawaremono no Akuyaku Reisoku ni Tensei shita no ni, Naze ka Mawari ga Hanatte Oite Kurenai (`.../858515`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | I Was Abandoned and Reincarnated as an Imperial Princess (`.../857548`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kirawaremono no Akuyaku Reisoku ni Tensei shita no ni, Naze ka Mawari ga Hanatte Oite Kurenai (`.../858515`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kirawaremono no Akuyaku Reisoku ni Tensei shita no ni, Naze ka Mawari ga Hanatte Oite Kurenai (`.../858515`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 28 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kirawaremono no Akuyaku Reisoku ni Tensei shita no ni, Naze ka Mawari ga Hanatte Oite Kurenai, URL=`858515` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawuwu.net/.../858515-160x71.webp` (image/webp (encoding: lossy), 6208 bytes, 160x71) |  |  |  |
| details identity | PASS | Details preserved selected URL `858515` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rawuwu.net/.../858515-160x71.jpeg` (image/jpeg, 6096 bytes, 160x71; server Content-Type: application/octet-stream) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | fantasy, seinen, action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “I”, a modern Japanese office worker, suddenly finds himself reincarnated into a game world… as the ugly, pushover son of a villain, Klaus Muller!! Realizing that if he plays out the game as it is in the original, he will be condemned and executed by the hero, he begins to take action to avoid the \[…\]<br><br>Alternative Names: <br> - Kirawaresha No Akuyaku Reisoku Ni Tensei Shita No Ni<br> - Naze Ka Mawari Ga Hanatte Oite Kurenai<br> - I’ve Been Reborn as a Hated Villain<br> - but for Some Reason People Around Me Won’t Leave Me Alone<br> - 嫌われ者の悪役令息に転生したのに、なぜか周りが放っておいてくれない |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s4.rawuwu.net/.../000-1080x1535.webp` (image/webp (encoding: lossy), 177402 bytes, 1080x1535) |  |  |  |
