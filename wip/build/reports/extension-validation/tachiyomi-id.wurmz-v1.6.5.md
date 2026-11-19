# Extension Validation Report

- Extension: tachiyomi-id.wurmz-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 925868633785419090
- Source name: Wurmz
- Source language: id
- Selected manga input: popular offset 0: Male Lead Is Obsessed With My Health (`.../pemeran-utama-pria-terobsesi-dengan-kesehatan-saya`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Male Lead Is Obsessed With My Health (`.../pemeran-utama-pria-terobsesi-dengan-kesehatan-saya`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | Grand Duchess's Constitution (`.../konstitusi-adipati-agung`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | The Hottest Enemy (`.../musuh-terpanas`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Aisai no Ura Aka (`.../akun-rahasia-istri-tercinta`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Male Lead Is Obsessed With My Health (`.../pemeran-utama-pria-terobsesi-dengan-kesehatan-saya`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Male Lead Is Obsessed With My Health (`.../pemeran-utama-pria-terobsesi-dengan-kesehatan-saya`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 88 | Chapter 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Male Lead Is Obsessed With My Health, URL=`.../pemeran-utama-pria-terobsesi-dengan-kesehatan-saya` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wurmz.net/.../manhwa__pemeran-utama-pria-terobsesi-dengan-kesehatan-saya.webp` (image/webp (encoding: lossy), 18608 bytes, 220x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pemeran-utama-pria-terobsesi-dengan-kesehatan-saya` |  |  |  |
| details thumbnail URL | PASS | `https://wurmz.net/.../manhwa__pemeran-utama-pria-terobsesi-dengan-kesehatan-saya.webp` |  |  |  |
| details author | PASS | 윤슬 \| 슈퍼코믹스스튜디오 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adaptation, Comedy, Drama, Fantasy, Isekai, Kids, Romance, Royal Family, Royalty, Shoujo, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seorang wanita bereinkarnasi ke dunia novel sebagai karakter sampingan yang lemah dan sakit-sakitan. Hidupnya dipenuhi ketidakpastian karena tubuhnya sangat rapuh. Tapi siapa sangka, male lead dari cerita asli tiba-tiba jadi sangat terobsesi dengan kesehatannya! Dia: Mengawasi makannya Memberi obat dan eliksir langka Bahkan membunuh monster demi bahan penyembuh Padahal, FL hanya ingin hidup tenang dan tidak mencuri spotlight. Tapi perhatian ML yang overprotective bikin semua jadi rumit... dan kadang bikin deg-degan juga. ❤️‍????<br><br>Nama Alternatif: Male Lead Is Obsessed With My Health \| 남주가 제 건강에 집착합니다 \| Male Lead Obsessed With My Health \| Arelyn Is Sick and Tired \| The Frail Lady Is Being Adorned by the Obsessive Crown Prince |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 88 chapters |  |  |  |
| chapter dates | LINT | 87 of 88 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=87 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.uqni.net/.../56790848a1kxt8d001.jpg` (image/jpeg, 79734 bytes, 720x2160; server Content-Type: application/octet-stream) |  |  |  |
