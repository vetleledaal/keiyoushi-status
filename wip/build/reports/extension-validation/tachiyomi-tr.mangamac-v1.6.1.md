# Extension Validation Report

- Extension: tachiyomi-tr.mangamac-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1177805345796737831
- Source name: MangaMAC
- Source language: tr
- Selected manga input: latest offset 0: Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | Tsue to Tsurugi no Wistoria (`.../tsue-to-tsurugi-no-wistoria`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Smoking Behind the Supermarket with You (`.../smoking-behind-the-supermarket-with-you`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 35 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Haimiya-senpai wa Kowakute Kawaii (`.../haimiya-senpai-wa-kowakute-kawaii`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Bölüm 1 (`.../haimiya-senpai-wa-kowakute-kawaii-bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Haimiya-senpai wa Kowakute Kawaii, URL=`.../haimiya-senpai-wa-kowakute-kawaii` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 119/119 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 119/119 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangamac.com/.../6ab8fb3f28f70_1790507839.jpg` (image/jpeg, 980287 bytes, 1512x2150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../haimiya-senpai-wa-kowakute-kawaii` |  |  |  |
| details thumbnail URL | PASS | `https://mangamac.com/.../6ab8fb3f28f70_1790507839.jpg` |  |  |  |
| details author | PASS | Kamiyama Sumu |  |  |  |
| details artist | PASS | Kamiyama Sumu |  |  |  |
| details genres | PASS | Komedi, Romantik, Shounen, Okul Hayatı |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lisemde Haimiya adlı, herkes tarafından fazla korkunç görülen bir senpai var. İnsanlar bu korkunçluğun dobra hitabından ve görünüşünden… bir de ışıldak piercinglerinden olduğunu iddia ediyor! uzun gri saçlarından, şivesine kadar tam takır korkunç bir kız!!<br>Ama herkesin korkulu rüyası bu senpai bana karşı… Nazik mi?<br>Korkunç, güzele. Zorbalığın, sevimliliğe döndüğü bu yürek hoplatan romantik komedi, korkunç senpaimiz ile başlıyor!!<br><br>**Kaynak:** MangaMAC |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangamac.com/.../haimiya-senpai-wa-kowakute-kawaii-bolum-1` to `https://mangamac.com/.../bolum-1` (1 redirects) |  |  |  |
| page load | PASS | `https://mangamac.com/.../0001.avif` (image/avif (format: avif), 226159 bytes, 1080x1536) |  |  |  |
