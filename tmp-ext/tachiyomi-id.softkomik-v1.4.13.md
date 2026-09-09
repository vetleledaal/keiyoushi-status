# Extension Validation Report

- Extension: tachiyomi-id.softkomik-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 20
- Lint: 0
- Warnings: 0
- Skipped: 13
- Failed: 4
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4398521787288838980
- Source name: Softkomik
- Source language: id
- Selected manga input: popular offset 0: Nano Machine (`.../nano-machine-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Nano Machine (`.../nano-machine-bahasa-indonesia`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 24 | Steins;Gate - Boukan no Rebellion (`.../steins-gate-boukan-no-rebellion-bahasa-indonesia`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: Gagal mendapatkan session. Coba lagi. | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Nano Machine (`.../nano-machine-bahasa-indonesia`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| search operation | ERROR | java.lang.Exception: Gagal mendapatkan session. Coba lagi. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | SKIP | Gagal mendapatkan session. Coba lagi. |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.softdevices.my.id/.../nano-machine.webp` (image/webp (encoding: lossy), 24698 bytes, 200x280) |  |  |  |
| details identity | PASS | Details preserved selected URL `nano-machine-bahasa-indonesia` |  |  |  |
| details thumbnail URL | PASS | `https://cover.softdevices.my.id/.../nano-machine.webp` |  |  |  |
| details author | PASS | Han-Joong-Wueol-Ya \[Add, \] |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Martial Arts, Fantasy, Action, Adventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Setelah direndahkan dan menghabiskan hidupnya dalam bahaya, seorang yatim piatu dari pemuja iblis, Yeo-Woon, mendapatkan kunjungan tak terduga dari keturunannya dari masa depan yang memasukkan sebuah mesin nano ke dalam tubuh Cheon-Woon, yang mengubah hidup Cheon Yeo Woon setelah aktivasi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
