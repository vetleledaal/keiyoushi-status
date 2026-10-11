# Extension Validation Report

- Extension: tachiyomi-ru.henchan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 4
- Warnings: 2
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: multichan
- Source ID: 5504588601186153612
- Source name: HenChan
- Source language: ru
- Selected manga input: latest offset 0: Волнующее похищение (`.../55772-volnuyuschee-pohischenie.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Волнующее похищение (`.../55772-volnuyuschee-pohischenie.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Inazuma Steamy Evening Bathhouse Party (Жаркая вечерняя банная вечеринка в Инадзуме) (`.../55748-inazuma-steamy-evening-bathhouse-party-zharkaya-vechernyaya-bannaya-vecherinka-v-inadzume.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Волнующее похищение (Tokimeki Abduction) (`.../55772-volnuyuschee-pohischenie.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Волнующее похищение (`.../55772-volnuyuschee-pohischenie.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Волнующее похищение (`.../55772-volnuyuschee-pohischenie.html <redacted query values: cacheId>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Волнующее похищение (Tokimeki Abduction), URL=`.../55772-volnuyuschee-pohischenie.html` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img4.imgschan.xyz/.../01.jpg` (image/jpeg, 12115 bytes, 208x291) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../55772-volnuyuschee-pohischenie.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://imgcover.imgschan.xyz/.../01.jpg` (image/jpeg, 12115 bytes, 208x291) |  |  |  |
| details author | PASS | ﻿Harukigenia (Haruki Genia) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | , ahegao, megane, большая грудь, в первый раз, вибратор, гг девушка, гг парень, дилдо, кремпай, минет, обычный секс, огромный член, романтика, секс игрушки, школьная форма, юмор |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is blank; use null when unknown |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mimg4.imgschan.xyz/.../01.webp` to `https://megaimg.imgschan.xyz/.../01.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://mimg4.imgschan.xyz/.../01.webp` (image/webp (container: extended), 165162 bytes, 1000x1437) |  |  |  |
