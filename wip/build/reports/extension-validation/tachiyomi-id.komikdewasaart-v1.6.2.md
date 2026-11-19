# Extension Validation Report

- Extension: tachiyomi-id.komikdewasaart-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6053881646324024096
- Source name: Komik Dewasa Art
- Source language: id
- Selected manga input: latest offset 0: Aku di Paksa Untuk Menghamili Banyak Wanita (`.../aku-di-paksa-untuk-menghamili-banyak-wanita`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Komik Fasik Surti (NO SENSOR) (`.../komik-fasik-surti`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Adik Yang Merepotkan (`.../adik-yang-merepotkan`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Aku di Paksa Untuk Menghamili Banyak Wanita (`.../aku-di-paksa-untuk-menghamili-banyak-wanita`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | (GA SENSOR) Tolong Hentikan Dia (`.../ga-sensor-tolong-hentikan-dia`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aku di Paksa Untuk Menghamili Banyak Wanita (`.../aku-di-paksa-untuk-menghamili-banyak-wanita`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 34 | Chapter 01 (`.../aku-di-paksa-untuk-menghamili-banyak-wanita-chapter-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../komik-dewasa-There-are-Not-Enough-Men.jpg <redacted query values: resize>` (image/jpeg, 21458 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aku-di-paksa-untuk-menghamili-banyak-wanita` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../komik-dewasa-There-are-Not-Enough-Men.jpg` (image/jpeg, 20120 bytes, 292x350) |  |  |  |
| details author | PASS | Team Biyam |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Big breast, Big breasts, Big penis, Harem, Huge breasts, Manhwa, Nakadashi, Sole female, Sole male, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Akibat hilangnya seluruh populasi laki-laki, umat manusia mengalami evolusi saat berada di ambang kepunahan, dan para laki-laki yang selamat berubah menjadi “Egnam”. Misi yang diberikan kepada mereka adalah memuaskan hasrat seksual para perempuan dengan dalih “reproduksi”……<br><br>Alternative Names: <br>- 남자가 부족해요<br>- Hacen Falta Hombres<br>- El Unico Hombre |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | PASS | 34 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://warungkomikcdn.icu/.../KOMIKDEWASA.ART-There-are-Not-Enough-Men-Chapter-01-1.jpg` (image/jpeg, 1266942 bytes, 720x8811) |  |  |  |
