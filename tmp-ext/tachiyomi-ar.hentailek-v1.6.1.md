# Extension Validation Report

- Extension: tachiyomi-ar.hentailek-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1258840903039841012
- Source name: هنتاي ليك
- Source language: ar
- Selected manga input: popular offset 0: إدمان زوجة الأب (`.../addicted-to-my-stepmom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | إدمان زوجة الأب (`.../addicted-to-my-stepmom`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 42 | A Pervert's Daily Life (`.../a-pervert-s-daily-life`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | Beautiful Days (`.../beautiful-days`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | Live-In Son-in-Law (`.../live-in-son-in-law`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | إدمان زوجة الأب (`.../addicted-to-my-stepmom`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | إدمان زوجة الأب (`.../addicted-to-my-stepmom`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 101 | الفصل 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=إدمان زوجة الأب, URL=`.../addicted-to-my-stepmom` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 24 manga entries; Popular page 2 repeats 21 manga entries; Latest page 1 repeats 24 manga entries; Latest page 2 repeats 21 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 181/181 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 181/181 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://0096423.xyz/.../cover-thumb.webp` (image/webp (encoding: lossy), 22036 bytes, 400x624) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../addicted-to-my-stepmom` |  |  |  |
| details thumbnail URL | PASS | `https://0096423.xyz/.../cover-thumb.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | تدور القصة حول هوس Jiwon بزوجة أبيه الجميلة وإدمانه المتزايد تجاهها، مما يدفعه إلى نقطة لا يمكن العودة منها. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://0096423.xyz/.../001.webp` (image/webp (encoding: lossy), 126288 bytes, 720x7117) |  |  |  |
