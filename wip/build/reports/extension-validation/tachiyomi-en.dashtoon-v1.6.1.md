# Extension Validation Report

- Extension: tachiyomi-en.dashtoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5660868393218262003
- Source name: Dashtoon
- Source language: en
- Selected manga input: popular offset 0: The Secret of Giza (`.../the-secret-of-giza_SHOetIuuonHmTNzSejs`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 190 | The Secret of Giza (`.../the-secret-of-giza_SHOetIuuonHmTNzSejs`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Secret of Giza (`.../the-secret-of-giza_SHOetIuuonHmTNzSejs`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Secret of Giza (`.../the-secret-of-giza_SHOetIuuonHmTNzSejs`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 114 | Prologue (`.../EPIb3uVpT4Ha20Mdl9O`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 190 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Secret of Giza, URL=`.../the-secret-of-giza_SHOetIuuonHmTNzSejs` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 191/191 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 191/191 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://content.dashtoon.ai/.../SHOetIuuonHmTNzSejs5U5582SLO1RjA5uB.png` (image/jpeg, 776079 bytes, 1080x1920; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-secret-of-giza_SHOetIuuonHmTNzSejs` |  |  |  |
| details thumbnail URL | PASS | `https://content.dashtoon.ai/.../SHOetIuuonHmTNzSejs5U5582SLO1RjA5uB.png` |  |  |  |
| details author | PASS | DreamWeaver |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Sci-fi, Thriller, Superhero, Historical, Alien Invasion |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | What if you wake up one day to discover you have superpowers? This is the story of Jaden and Malia, twins in freshman year who are thrust into a world of secrets. In a pulse-pounding race against time, they discover they're anything but ordinary. Brace for their mind-bending odyssey across the globe, from the enigmatic Bermuda Triangle to the secretive confines of Area 51 and the ancient mysteries of the Pyramids of Giza, all while facing the shocking arrival of an alien species!<br><br>\- Based on the best selling novel by Ken Warner's |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 7 name, chapter 16 name, chapter 20 name, chapter 53 name, chapter 78 name |  |  |  |
| chapters | PASS | 114 chapters |  |  |  |
| chapter dates | PASS | 114 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://content.dashtoon.ai/.../PANLGownlTLebvDprDD.png` (image/webp (encoding: lossless), 272576 bytes, 800x1125) |  |  |  |
