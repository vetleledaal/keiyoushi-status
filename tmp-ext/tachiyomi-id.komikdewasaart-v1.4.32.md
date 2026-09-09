# Extension Validation Report

- Extension: tachiyomi-id.komikdewasaart-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6053881646324024096
- Source name: Komik Dewasa Art
- Source language: id
- Selected manga input: latest offset 0: (GA SENSOR) Bimbingan Ekstrem Di Akademi Pendidikan Seks (`.../ga-sensor-bimbingan-ekstrem-di-akademi-pendidikan-seks`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Komik Fasik Surti (NO SENSOR) (`.../komik-fasik-surti`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Adik Yang Merepotkan (`.../adik-yang-merepotkan`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | (GA SENSOR) Bimbingan Ekstrem Di Akademi Pendidikan Seks (`.../ga-sensor-bimbingan-ekstrem-di-akademi-pendidikan-seks`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Aku Suka Sama Payudaramu Itu (`.../aku-suka-sama-payudaramu-itu`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | (GA SENSOR) Bimbingan Ekstrem Di Akademi Pendidikan Seks (`.../ga-sensor-bimbingan-ekstrem-di-akademi-pendidikan-seks`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 01 END (`.../ga-sensor-bimbingan-ekstrem-di-akademi-pendidikan-seks-chapter-01-end`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 126 |  |  | 1-10s |

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
| thumbnail | PASS | `https://i1.wp.com/.../Seikyoiku-Gakuen-no-Kageki-Shido.-Soshuhen.jpg <redacted query values: resize>` (image/jpeg, 49063 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ga-sensor-bimbingan-ekstrem-di-akademi-pendidikan-seks` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../Seikyoiku-Gakuen-no-Kageki-Shido.-Soshuhen.jpg` (image/jpeg, 145293 bytes, 300x450) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Big breasts, Big cock, Blowjob, Brutal sex, Full color, Manga |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Names: 性教育学園の過激指導。総集編 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 126 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://warungkomikcdn.icu/.../tPn0b0Al-id-002.jpg` (image/jpeg, 3230231 bytes, 1333x3887) |  |  |  |
