# Extension Validation Report

- Extension: tachiyomi-all.mangafire-v1.6.34
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 6084907896154116083
- Source name: MangaFire
- Source language: en
- Selected manga input: latest offset 0: Nine Peaks (`.../m2l8v-nine-peakss`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | All-Class Awakening: God Slayer (`.../ro8ro-all-class-awakening-god-slayer`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | The Spark in Your Eyes (`.../2oxp4-jeomuneun-hae-silin-nunn`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Nine Peaks (`.../m2l8v-nine-peakss`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Kidnapped Dragons (`.../lx2xz-kidnapped-dragons`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | Nine Peaks (`.../m2l8v-nine-peakss`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nine Peaks (`.../m2l8v-nine-peakss`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 172 | Ch. 1 - Endings are Beginnings (`.../2615567-chapter-1-en`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 72 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nine Peaks, URL=`.../m2l8v-nine-peakss` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mfcdn.nl/.../0126c0b0fbdd4a70a7cf70eb9c95484f.jpg` (image/jpeg, 32163 bytes, 280x400; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../m2l8v-nine-peakss` |  |  |  |
| details thumbnail URL | PASS | `https://static.mfcdn.nl/.../0126c0b0fbdd4a70a7cf70eb9c95484f.jpg` |  |  |  |
| details author | PASS | Hirakawa Tetsuhiro |  |  |  |
| details artist | PASS | HIRAKAWA Tetsuhiro |  |  |  |
| details genres | PASS | Manga, Action, Drama, Slice of Life, School Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The main character, Masio Gaku, doesn't get along well with his father. After a quarrel with his son, Masio Harumi dies. Gaku could not even imagine that so many people would come to say goodbye to his father, who is not a very sociable person. Gaku soon decides to go fishing where he accidentally falls into the sea. but he immediately gets out with the help of some strange person. This stranger turned out to be his father, exactly in 2000! Now Gaku begins to help Harumi, his father, achieve the status of the leader of the city and figure out what is happening here. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 172 chapters |  |  |  |
| chapter dates | PASS | 172 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 72 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://nw8.mfcdn3.xyz/.../p.jpg` (image/jpeg, 318456 bytes, 1036x1600) |  |  |  |
