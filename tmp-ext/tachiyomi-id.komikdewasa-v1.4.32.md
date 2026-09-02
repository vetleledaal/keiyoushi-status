# Extension Validation Report

- Extension: tachiyomi-id.komikdewasa-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8753851309776247979
- Source name: Komik Dewasak
- Source language: id
- Selected manga input: popular offset 0: Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Terlahir Dengan Penis Besar (`.../terlahir-dengan-penis-besar`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Aku Akan Melindungimu (`.../aku-akan-melindungimu`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Istri yang luluh (terbuai) — Ayah (`.../istri-yang-luluh-terbuai-ayah`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 107 | Chapter 00 (`.../kebugaran-tanpa-sensor-chapter-00`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kebugaran Tanpa Sensor, URL=`.../kebugaran-tanpa-sensor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../thumbnail.webp <redacted query values: resize>` (image/png, 57634 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kebugaran-tanpa-sensor` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../thumbnail.webp` (image/png, 143446 bytes, 522x647) |  |  |  |
| details author | PASS | manhwa |  |  |  |
| details artist | PASS | manhwa |  |  |  |
| details genres | PASS | Adult, Big, Blow job, Drama, Manhua, Manhwa, Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Baca Komik Manhwa Dewasa Fitness Uncensored Bahasa Indonesia Terbaru dan Terupdate Hanya Dikomikindo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | LINT | All 107 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=107 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn5.fajarsumatera.com/.../1.jpg` (image/jpeg, 340703 bytes, 720x3764) |  |  |  |
