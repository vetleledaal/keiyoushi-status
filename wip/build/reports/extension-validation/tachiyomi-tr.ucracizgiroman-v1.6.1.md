# Extension Validation Report

- Extension: tachiyomi-tr.ucracizgiroman-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2895434874576908511
- Source name: Ücra Çizgi Roman
- Source language: tr
- Selected manga input: popular offset 0: Küçük Kırmızı Ronin (`.../kucuk-krmz-ronin.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Küçük Kırmızı Ronin (`.../kucuk-krmz-ronin.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Planet Hulk Öncesi (`.../planet-hulk-oncesi.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Küçük Kırmızı Ronin (`.../kucuk-krmz-ronin.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Venom (2021) Cilt 1-2 (`.../venom-2021.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Küçük Kırmızı Ronin (`.../kucuk-krmz-ronin.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Küçük Kırmızı Ronin (`.../kucuk-krmz-ronin.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Küçük Kırmızı Ronin #01 (`.../kucuk-krmz-ronin-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Küçük Kırmızı Ronin, URL=`.../kucuk-krmz-ronin.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../LR%20Ronin%2001-000.jpg` (image/jpeg, 513020 bytes, 1040x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kucuk-krmz-ronin.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../LR%20Ronin%2001-000.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Korkunç bir canavar, onlarca yıldır Poletown sakinlerinin peşini bırakmıyor. Canavar yıllardır görülmemiş olsa da, gizemli kayboluşlar ve vahşi cinayetler kasaba halkının başına bela olmaya devam ediyor. Ailesinin adını temize çıkarmaya kararlı olan Red, korkunç propagandalar yaydığı gerekçesiyle sürgünde yaşayan büyükannesini aklamak umuduyla "Büyük Kurt"un izini sürüyor.<br><br>**Orijinal isim:** Little Red Ronin · **Yayınevi:** Source Point Press · **Yayın yılı:** 2022 · **Seri:** 3 Sayı |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://drive.usercontent.google.com/.../download <redacted query values: id and export>` (image/jpeg, 1033933 bytes, 1500x2307) |  |  |  |
