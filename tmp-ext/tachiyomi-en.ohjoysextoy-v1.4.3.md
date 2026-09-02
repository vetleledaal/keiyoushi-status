# Extension Validation Report

- Extension: tachiyomi-en.ohjoysextoy-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4502591927177845825
- Source name: Oh Joy Sex Toy
- Source language: en
- Selected manga input: latest offset 0: A UNI-Versal Experience (`.../a-uni-versal-experience-darkchibishadow`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 84 | A UNI-Versal Experience (`.../a-uni-versal-experience-darkchibishadow`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 84 | Weathering the Storm (`.../weathering-the-storm-ripley-lacross`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 4 | A UNI-Versal Experience (`.../a-uni-versal-experience-darkchibishadow`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 66 | A UNI-Versal Experience (`.../a-uni-versal-experience-darkchibishadow`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | A UNI-Versal Experience (`.../a-uni-versal-experience-darkchibishadow`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Oh Joy Sex Toy - A UNI-Versal Experience by DarkChibiShadow (`.../a-uni-versal-experience-darkchibishadow`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 84 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A UNI-Versal Experience, URL=`.../a-uni-versal-experience-darkchibishadow` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 238/238 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 172/238 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ohjoysextoy.com/.../Universal__OJST_preview-sm.png` (image/png, 42344 bytes, 396x396) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-uni-versal-experience-darkchibishadow` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.ohjoysextoy.com/.../Universal__twitter.jpg` (image/jpeg, 196249 bytes, 1200x630) |  |  |  |
| details author | PASS | DarkChibiShadow |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comic, Guest Reviews, Non-Fiction Comics, Penis Toys, Review Comics, Shareable Comics, Transcribed |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Text: Oh Joy Sex Toy presents UNI-versal Experience by DarkChibiShadow
<br>Image: A cartoony person with spiky blue hair and square black glasses gazes in delight and wonder at a collection of enormous jewels floating in the air....<br><br>Portfolio: https://www.darkchibishadow.com<br>Itch.io: https://darkchibishadow.itch.io<br>Bigcartel: https://darkchibishadow.bigcartel.com<br>Bluesky: https://bsky.app/.../darkchibishadow.bsky.social<br><br>(Full description and credits in WebView) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.ohjoysextoy.com/.../2026-09-01-A-UNI-versal-experience-DarkChibiShadow-1.jpg` (image/jpeg, 800095 bytes, 1536x2690) |  |  |  |
