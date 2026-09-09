# Extension Validation Report

- Extension: tachiyomi-en.cutiecomics-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7821715230468497947
- Source name: Cutie Comics
- Source language: en
- Selected manga input: popular offset 0: IF YOU LIKE ME, THEN GET IT, AS MUCH AS YOU WANT | SUKINARA SUKIDASHI SUKINADAKE (`.../22586-if-you-like-me-then-get-it-as-much-as-you-want-sukinara-sukidashi-sukinadake.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | IF YOU LIKE ME, THEN GET IT, AS MUCH AS YOU WANT | SUKINARA SUKIDASHI SUKINADAKE (`.../22586-if-you-like-me-then-get-it-as-much-as-you-want-sukinara-sukidashi-sukinadake.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | NIJIGEN OTAKU NO ORE GA TENKOU SHITE KITA KYONYUU IDOL NI OTOSARERU MADE (`.../22618-nijigen-otaku-no-ore-ga-tenkou-shite-kita-kyonyuu-idol-ni-otosareru-made.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | IF YOU LIKE ME, THEN GET IT, AS MUCH AS YOU WANT | SUKINARA SUKIDASHI SUKINADAKE (`.../22586-if-you-like-me-then-get-it-as-much-as-you-want-sukinara-sukidashi-sukinadake.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | IF YOU LIKE ME, THEN GET IT, AS MUCH AS YOU WANT | SUKINARA SUKIDASHI SUKINADAKE (`.../22586-if-you-like-me-then-get-it-as-much-as-you-want-sukinara-sukidashi-sukinadake.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../22586-if-you-like-me-then-get-it-as-much-as-you-want-sukinara-sukidashi-sukinadake.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=IF YOU LIKE ME, THEN GET IT, AS MUCH AS YOU WANT \| SUKINARA SUKIDASHI SUKINADAKE, URL=`.../22586-if-you-like-me-then-get-it-as-much-as-you-want-sukinara-sukidashi-sukinadake.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cutiecomics.com/.../1788099855_1.webp` (image/webp (encoding: lossy), 40402 bytes, 290x409) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../22586-if-you-like-me-then-get-it-as-much-as-you-want-sukinara-sukidashi-sukinadake.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cutiecomics.com/.../1788099960_1.jpg` (image/jpeg, 267183 bytes, 900x1278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Apparel Bukkake, Big Areolae, Big Breasts, Blowjob, Business Suit, Clothed Paizuri, Cosplaying, Dark Skin, Drunk, Emotionless Sex, Femdom, Garter Belt, Glasses, Hotpants, Kissing, Maid, Nakadashi, Paizuri, Ponytail, Schoolgirl Uniform, Stirrup Legwear |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cutiecomics.com/.../1788099960_1.jpg` (image/jpeg, 267183 bytes, 900x1278) |  |  |  |
