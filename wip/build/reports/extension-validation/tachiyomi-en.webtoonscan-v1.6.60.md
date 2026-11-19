# Extension Validation Report

- Extension: tachiyomi-en.webtoonscan-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3062846066388633553
- Source name: WebtoonScan
- Source language: en
- Selected manga input: popular offset 0: My Girlfriend Was Already Fully Trained (`.../54`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | My Girlfriend Was Already Fully Trained (`.../54`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I Banged All My Classmates After Graduation (`.../92`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Currently Filming (`.../1375`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Unbreakable (`.../1275`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Girlfriend Was Already Fully Trained (`.../54`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Girlfriend Was Already Fully Trained (`.../54`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 49 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Girlfriend Was Already Fully Trained, URL=`54` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoonscan.org/.../my-girlfriend-was-already-fully-trained.webp` (image/webp (encoding: lossy), 33720 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `54` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://webtoonscan.org/.../my-girlfriend-was-already-fully-trained-193x278.webp` (image/webp (encoding: lossy), 13374 bytes, 193x278) |  |  |  |
| details author | PASS | Jinaganeun Geumtaeyang, Kong Shimi |  |  |  |
| details artist | PASS | Doya |  |  |  |
| details genres | PASS | Adult, Drama, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “I shouldn’t have checked my girlfriend’s phone that day.” I heard a strange rumor about my girlfriend, Hayoung, from a friend. “I saw Hayoung go out of a motel… with another man”. I turned a blind eye to what they said, thinking they must’ve been mistaken with what they saw. However, a part of me was suspicious of her. And for the first time, I checked my girlfriend’s phone… “What are you doing? Strip. Take off your bra and panties.”<br><br>★★★★★ 5 (1)<br>2026 · Manhwa<br><br>**Alternative Name(s):**<br>- My Girlfriend's Corruption<br>- Mi Novia Ya Ha Sido Completamente Entrenada<br>- My Girlfriend Has Already Completed the Assistant Training<br>- My Girlfriend Has Already Done Teaching<br>- My Girlfriend Is Already Trained<br>- 내 여자친구는 이미 조교완료 되었다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | PASS | 49 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.webtoonscan.org/.../0.jpg` (image/jpeg, 1057776 bytes, 720x16563) |  |  |  |
