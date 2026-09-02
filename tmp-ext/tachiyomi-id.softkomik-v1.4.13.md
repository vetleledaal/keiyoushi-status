# Extension Validation Report

- Extension: tachiyomi-id.softkomik-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 19
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
- Selected manga input: latest offset 0: WiraDelima (Qoni) (`.../wiradelima-qoni-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Nano Machine (`.../nano-machine-bahasa-indonesia`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 24 | WiraDelima (Qoni) (`.../wiradelima-qoni-bahasa-indonesia`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: Gagal mendapatkan session. Coba lagi. | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | WiraDelima (Qoni) (`.../wiradelima-qoni-bahasa-indonesia`) |  | 10s+ |
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
| thumbnail | PASS | `https://cover.softdevices.my.id/.../cover-359585-1788245987677-6po9gsd6.webp` (image/webp (encoding: lossy), 11542 bytes, 300x432) |  |  |  |
| details identity | PASS | Details preserved selected URL `wiradelima-qoni-bahasa-indonesia` |  |  |  |
| details thumbnail URL | PASS | `https://cover.softdevices.my.id/.../cover-359585-1788245987677-6po9gsd6.webp` |  |  |  |
| details author | PASS | Qoni |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Shoujo, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kisah seorang Wira, adik kelas yang bucin BANGET sama Delima, kakak kelasnya. Tapi, Delima tidak pede dengan tubuh mungilnya. Sejauh mana Wira akan berjuang demi menjaga senyum kak Delima-nya? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
