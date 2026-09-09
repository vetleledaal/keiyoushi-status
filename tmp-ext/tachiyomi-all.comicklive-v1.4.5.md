# Extension Validation Report

- Extension: tachiyomi-all.comicklive-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4972933717624256217
- Source name: Comick (Unoriginal)
- Source language: en
- Selected manga input: latest offset 0: Relative Sins (`.../relative-sins`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | The Unlimited Bacteriomancer (`.../the-unlimited-bacteriomancer`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | The Unlimited Bacteriomancer (`.../the-unlimited-bacteriomancer`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 100 | Relative Sins (`.../relative-sins`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | Relative Sins (`.../relative-sins`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Relative Sins (`.../relative-sins`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 23 | Ch. 11 (`.../RFgHSRF-chapter-11-en`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 112 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | SKIP | Covered by popular and latest pagination failures |  |  |  |
| manga title and URL | PASS | 300/300 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 300/300 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.comicknew.pictures/.../40bb6193.webp` (image/webp (encoding: lossy), 33004 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `relative-sins` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.comicknew.pictures/.../40bb6193.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Content Rating: Erotica, Smut, Yaoi, Historical, Drama, Adult |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Relative Sins summary: A prince with no claim to the throne, Yi Tae-Rok lives a quiet life removed from power.<br><br>At thirteen, he is entrusted with raising his nephew, Yi Nan-Yeong, a gentle boy with no talent for the sword and no expectations placed upon him.<br><br>At first, Tae-Rok sees it only as duty.<br><br>But Nan-Yeong grows up looking only at him.<br><br>What begins as admiration slowly shifts into something deeper, something neither of them can easily name.<br><br>Tae-Rok notices the change and chooses silence, drawing careful lines he refuses to cross.<br><br>In the end, Nan-Yeong seeks clarity in the only way he can, by testing his feelings with another man.<br><br>And Tae-Rok sees it.<br><br>*“Then you become my scandal.<br><br>And I become yours.”* In a court bound by rules, blood, and reputation, their bond teeters on the edge of ruin, where desire threatens to turn into something neither can undo.<br><br>(Source: Lezhin US) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 112 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn1.comicknew.pictures/.../0.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
