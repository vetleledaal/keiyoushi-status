# Extension Validation Report

- Extension: tachiyomi-tr.eldermanga-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5412929724953013469
- Source name: Elder Manga
- Source language: tr
- Selected manga input: latest offset 0: Kıyamette Başkalarını Güçlendiriyorum (`.../kiyamette-baskalarini-guclendiriyorum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Kıyamette Sığınak Kurdum (`.../kiyamette-siginak-kurdum`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Tarikat Liderine Selam Olsun (`.../tarikat-liderine-selam-olsun`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Kıyamette Başkalarını Güçlendiriyorum (`.../kiyamette-baskalarini-guclendiriyorum`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Oyunun En Büyük Düşmanı! (`.../oyunun-en-buyuk-dusmani`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kıyamette Başkalarını Güçlendiriyorum (`.../kiyamette-baskalarini-guclendiriyorum`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kıyamette Başkalarını Güçlendiriyorum (`.../kiyamette-baskalarini-guclendiriyorum`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | Bölüm 1 (`.../1-bolum-oku`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kıyamette Başkalarını Güçlendiriyorum, URL=`.../kiyamette-baskalarini-guclendiriyorum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-el.efsaneler2.can.re/.../47ee1518-67fd-47b1-8046-d396454affa1.avif` (image/avif (format: avif), 114477 bytes, 810x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kiyamette-baskalarini-guclendiriyorum` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-el.efsaneler2.can.re/.../47ee1518-67fd-47b1-8046-d396454affa1.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Sistem, Super-güç |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <p>Ortaya çıkan gizemli “Kapılar”, canavarları dünyaya taşıyarak insanlığı kıyametin eşiğine sürükler. Başkalarının seviyesini yükseltme yeteneğine sahip tek kişi olan Xiao Haiyun, bu gücüyle insanlığın son kurtarıcısı olabilecek midir?<.../p%3E |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-el.efsaneler2.can.re/.../1__0mvg0c.avif` (image/avif (format: avif), 188453 bytes, 1086x1448) |  |  |  |
