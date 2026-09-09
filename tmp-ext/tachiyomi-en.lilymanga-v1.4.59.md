# Extension Validation Report

- Extension: tachiyomi-en.lilymanga-v1.4.59
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 4480996639887718467
- Source name: Lily Manga
- Source language: en
- Selected manga input: latest offset 0: Artificial Body Temperature 36.7°C (`.../artificial-body-temperature-36-7c`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | My Food Seems To Be Very Cute (`.../my-food-seems-to-be-very-cute`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Falling (`.../falling`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 12 | Artificial Body Temperature 36.7°C (`.../artificial-body-temperature-36-7c`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Listening to the Stars (`.../listening-to-the-stars`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Artificial Body Temperature 36.7°C (`.../artificial-body-temperature-36-7c`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Artificial Body Temperature 36.7°C (`.../artificial-body-temperature-36-7c`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 75 | Episode 00 - Self-Consciousness (`https://lilymanga.net/.../episode-00 <redacted query values: style>`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Artificial Body Temperature 36.7°C, URL=`.../artificial-body-temperature-36-7c` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lilymanga.net/.../Artificial-Body-Temperature-36.7%C2%B0C-GL-Manhua-350x476.webp` (image/webp (encoding: lossy), 38768 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../artificial-body-temperature-36-7c` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lilymanga.net/.../Artificial-Body-Temperature-36.7%C2%B0C-GL-Manhua-193x278.webp` (image/webp (encoding: lossy), 16894 bytes, 193x278) |  |  |  |
| details author | PASS | 不学禅 |  |  |  |
| details artist | PASS | 尼三岁, 橘姬社 |  |  |  |
| details genres | PASS | Drama, Psychological, Romance, Sci-fi, Shoujo Ai, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Su, born in prison, has always wanted to see the “crow” from what her mother told her. On the day when she was about to be secretly executed, Gill, the artificial intelligence, was thrown into prison for a test run. She compasses everything from the outside world in her database. Su developed special feelings for Gill, although she didn’t care that the words Gill spoke were programmed or from her own consciousness. Unable to distinguish her own human feelings… in this small cell, the lonely Su got her first doll–she met a “person” who could comfort her soul.<br><br>Original Webcomic<br><br><br><br>Alternative Names: Artificial Temperature 36.7°C; Rénzào Tǐwēn 36.7℃; Renzao Tiwen 36.7℃; 人造体温36.7℃ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 75 chapters |  |  |  |
| chapter dates | PASS | 75 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 75 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgftp.lilymanga.net/.../001.webp` (image/webp (encoding: lossy), 18438 bytes, 1088x330) |  |  |  |
