# Extension Validation Report

- Extension: tachiyomi-id.astralscans-v1.6.12
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 829250309114015686
- Source name: Astral Scans
- Source language: id
- Selected manga input: popular offset 0: While You Were Letting Your Guard Down (`.../while-you-were-letting-your-guard-down`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | While You Were Letting Your Guard Down (`.../while-you-were-letting-your-guard-down`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | No Compassion (`.../no-compassion`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | When Alpha Becomes Omega (`.../when-alpha-becomes-omega`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | PIT A PAT (`.../pit-a-pat`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | While You Were Letting Your Guard Down (`.../while-you-were-letting-your-guard-down`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | While You Were Letting Your Guard Down (`.../while-you-were-letting-your-guard-down`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=While You Were Letting Your Guard Down, URL=`.../while-you-were-letting-your-guard-down` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../a4afb8958fbc0903ad1316998716dc3a15991e67_700_940_218439-2.jpeg` (image/jpeg, 73754 bytes, 600x805) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../while-you-were-letting-your-guard-down` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../a4afb8958fbc0903ad1316998716dc3a15991e67_700_940_218439-2.jpeg` |  |  |  |
| details author | PASS | Yeonnu |  |  |  |
| details artist | PASS | Yeonnu |  |  |  |
| details genres | PASS | Comedy, Office worker, Yaoi, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Haemin, seorang Beta yang menghindari Alpha akibat dampak dari hubungan yang sebelumnya, berubah menjadi seorang omega karena cinta satu malam dengan seorang alpha dominan, Sung Han. Mengikuti saran dari dokter, dia mencari-cari sang alpha dominan tersebut untuk diajak melakukan hubungan sex secara rutin. Dia pun mengajukan tawaran dan menutup matanya pada Sung Han yang kebetulan juga bekerja di departemen yang sama dengannya. Kedua orang itu melakukan sex seminggu sekali dan perasaan pun mulai timbul di antara mereka. Namun, ketua tim yang baru, bernama Jin Tae muncul dan ternyata dia adalah mantan pacar Haemin yang memutuskannya karena Haemin adalah seorang Beta?! Kehidupan Haemin yang mulanya mulus kini makin lama makin rumit.<br><br>Alternative Names: <br>- While You Were Caught Off Guard<br>- 当你措手不及时<br>- 당신이 방심한 사이 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
