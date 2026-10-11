# Extension Validation Report

- Extension: tachiyomi-id.roseveil-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: loneseal
- Source ID: 5328028029485519937
- Source name: Roseveil
- Source language: id
- Selected manga input: popular offset 0: Adult Reading Club [ROSEVEIL] (`.../adult-reading-club-roseveil`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Adult Reading Club [ROSEVEIL] (`.../adult-reading-club-roseveil`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Transcension Academy [ROSEVEIL] (`.../transcension-academy-roseveil`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 100 | Sponsorship Stigma [ARIN] (`.../sponsorship-stigma-arin`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Adult Reading Club [ROSEVEIL] (`.../adult-reading-club-roseveil`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Adult Reading Club [ROSEVEIL] (`.../adult-reading-club-roseveil`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 62 | Chapter 1.1 (`.../chapter-1-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Adult Reading Club \[ROSEVEIL\], URL=`adult-reading-club-roseveil` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.roseveil.org/.../cover-25c061c6-9792-462b-8e74-d87359a4e406-809ae651-da0c-4b62-9023-c31c512c7142.jpg` (image/jpeg, 24579 bytes, 300x398) |  |  |  |
| details identity | PASS | Details preserved selected URL `adult-reading-club-roseveil` |  |  |  |
| details thumbnail URL | PASS | `https://api.roseveil.org/.../cover-25c061c6-9792-462b-8e74-d87359a4e406-809ae651-da0c-4b62-9023-c31c512c7142.jpg` |  |  |  |
| details author | PASS | Gold Bozi |  |  |  |
| details artist | PASS | Van (II) |  |  |  |
| details genres | PASS | Drama, Romance, Adult, Josei, Project, Smut, School Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Pada hari pertamanya masuk kuliah, Ho-eun bergabung dengan sebuah klub kampus—hanya untuk mendapati dirinya dikelilingi para senior yang menawan sekaligus berani tanpa rasa malu.<br><br>Yang diminta darinya hanyalah membacakan sebuah buku dengan suara lantang.<br>Awalnya terdengar mudah… sampai dia menyadari isi buku yang sedang dibacanya.<br><br>Malu, gugup, dan tak tahu harus bereaksi bagaimana, Ho-eun terjebak di antara rasa canggung, kebingungan—serta sensasi aneh yang tak mampu ia jelaskan.<br>Tatapan mereka, cara mereka menggodanya... membangkitkan sesuatu yang belum pernah ia rasakan sebelumnya.<br><br>Ia ingin melarikan diri, tetapi ada sesuatu yang membuatnya tetap bertahan.<br>Lagi pula, kelulusannya bergantung pada klub ini.<br><br>Akankah Ho-eun berhasil lolos dari cengkeraman para sunbae yang mesum dan berbahaya, atau justru akan semakin terseret ke dalam permainan mereka yang menyimpang? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 62 chapters |  |  |  |
| chapter dates | PASS | 62 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://09d8be3d2eda4e2e18705e9e379cefb5.r2.cloudflarestorage.com/.../a692583ab3a844aa92b48b0dff357bff.jpg <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/jpeg, 134897 bytes, 720x2880) |  |  |  |
