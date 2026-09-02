# Extension Validation Report

- Extension: tachiyomi-id.komikdewasaart-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6053881646324024096
- Source name: Komik Dewasa Art
- Source language: id
- Selected manga input: latest offset 0: Seorang Pahlawan Yang Berubah Menjadi Budak Seks Musuh Abadinya (`.../seorang-pahlawan-yang-berubah-menjadi-budak-seks-musuh-abadinya`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Komik Fasik Surti (NO SENSOR) (`.../komik-fasik-surti`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Adik Yang Merepotkan (`.../adik-yang-merepotkan`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Seorang Pahlawan Yang Berubah Menjadi Budak Seks Musuh Abadinya (`.../seorang-pahlawan-yang-berubah-menjadi-budak-seks-musuh-abadinya`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | (GA SENSOR) Semua Orang Mengingat Tubuhnya, Tidak Dengan Aktingnya (`.../ga-sensor-semua-orang-mengingat-tubuhnya-tidak-dengan-aktingnya`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Seorang Pahlawan Yang Berubah Menjadi Budak Seks Musuh Abadinya (`.../seorang-pahlawan-yang-berubah-menjadi-budak-seks-musuh-abadinya`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | Chapter 10 (`.../seorang-pahlawan-yang-berubah-menjadi-budak-seks-musuh-abadinya-chapter-10`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| thumbnail | PASS | `https://i1.wp.com/.../05105-COVER.webp <redacted query values: resize>` (image/jpeg, 31305 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../seorang-pahlawan-yang-berubah-menjadi-budak-seks-musuh-abadinya` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../05105-COVER.webp` (image/jpeg, 69751 bytes, 497x680) |  |  |  |
| details author | PASS | Mokson , goofy |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Big breast, Big penis, Collar, Full color, Horns, Stocking, Story arc, Webtoon, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seorang pahlawan legendaris yang pernah menyelamatkan Korea dari invasi iblis kini berjuang mencari pekerjaan normal di dunia modern. Karena putus asa mencari pekerjaan, ia melamar ke sebuah perusahaan misterius… hanya untuk menemukan bahwa ketua perusahaan tersebut tak lain adalah Raja Iblis yang pernah ia kalahkan bertahun-tahun lalu. Apa yang dimulai sebagai reuni kantor yang canggung dengan cepat berubah menjadi hubungan kerja yang sangat tidak biasa.<br><br>Alternative Names: 용사님은 책상 밑 비서, The Hero Is the Secretary Under the Desk |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://warungkomikcdn.icu/.../id-The-Hero-Is-the-Secretary-Under-the-Desk-Chapter-10-3-001.jpg` (image/jpeg, 1384327 bytes, 720x3774) |  |  |  |
