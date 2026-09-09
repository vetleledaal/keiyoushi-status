# Extension Validation Report

- Extension: tachiyomi-en.armageddon-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3696994059835859589
- Source name: SilentQuill
- Source language: en
- Selected manga input: popular offset 0: Doing Secret Things with the Holy Maidens (`.../doing-secret-things-with-the-holy-maidens`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Doing Secret Things with the Holy Maidens (`.../doing-secret-things-with-the-holy-maidens`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Cooking for the Cutest Gyaru (`.../cooking-for-the-cutest-gyaru`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Nezumi's First Love (`.../nezumis-first-love`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Doing Secret Things with the Holy Maidens (`.../doing-secret-things-with-the-holy-maidens`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Doing Secret Things with the Holy Maidens (`.../doing-secret-things-with-the-holy-maidens`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 109 | Chapter 1 (`.../889`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Doing Secret Things with the Holy Maidens, URL=`doing-secret-things-with-the-holy-maidens` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://silentquill.net/.../aHR0cHM6Ly9zaWxlbnRxdWlsbC5uZXQvd3AtY29udGVudC91cGxvYWRzLzIwMjUvMDYvRG9pbmctU2VjcmV0LTkud2VicA <redacted query values: w>` (image/webp (encoding: lossy), 21296 bytes, 320x459) |  |  |  |
| details identity | PASS | Details preserved selected URL `doing-secret-things-with-the-holy-maidens` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://silentquill.net/.../aHR0cHM6Ly9zaWxlbnRxdWlsbC5uZXQvd3AtY29udGVudC91cGxvYWRzLzIwMjUvMDYvRG9pbmctU2VjcmV0LTkud2VicA` (image/webp (encoding: lossy), 191978 bytes, 1696x2432) |  |  |  |
| details author | PASS | HIRAMEKI Bonjin |  |  |  |
| details artist | PASS | HIRAMEKI Bonjin |  |  |  |
| details genres | PASS | Adult, Comedy, Fantasy, Harem, Romance, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "Please teach us naughty things." One day, Itsuki is transported to another world, where he is confronted by sisters who serve the goddess. In order to return to the real world, he must give them practical sex education! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 109 chapters |  |  |  |
| chapter dates | PASS | 109 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://silentquill.net/.../6086-lKY_CtrbJLjn__gW` (image/webp (encoding: lossy), 80244 bytes, 1132x871) |  |  |  |
