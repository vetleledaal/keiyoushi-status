# Extension Validation Report

- Extension: tachiyomi-tr.mangawow-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2576579305327069452
- Source name: MangaWOW
- Source language: tr
- Selected manga input: popular offset 0: Görünüşçülük (`.../43389`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Görünüşçülük (`.../43389`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Reminiscence Adonis (`.../40419`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | My Wife is a Demon Queen (`.../103`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Bir Zorbayı Evcilleştirdim ve Kaçtım (`.../44047`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Görünüşçülük (`.../43389`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Görünüşçülük (`.../43389`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 486 | Bölüm 000 (`.../bolum-000`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Görünüşçülük, URL=`43389` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangawow.org/.../PicsArt_10-27-05.20.43-175x238.jpg` (image/jpeg, 11171 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `43389` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangawow.org/.../PicsArt_10-27-05.20.43-193x278.jpg` (image/jpeg, 13491 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hayalistic, Updating |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Hyung Suk (ya da Line Webtoon’daki ismiyle Daniel Park); fakir, aşırı kilolu ve hiçbir albenisi olmayan bir lise öğrencisidir. Her gün gittiği okulda sayısız kabadayılıkla uğraşmak zorunda kalmaktadır. Çeşitli olaylar sonunda yaşadığı hayattan kaçmak için okul değiştirir ve başka bir semtte yaşamaya devam etmeye karar verir fakat bu sefer değişen bir şey daha vardır. Başına bir mucize gelir.<br><br><br><br>Not: Bu seri 287. Bölüme kadar Emirsub ekibi tarafından çevirilmiştir.<br><br>Alternative Names: Lookism, 외모지상주의 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 486 chapters |  |  |  |
| chapter dates | PASS | 486 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yedek.mangawow.com/.../mangawow.png` (image/png, 282924 bytes, 1200x638) |  |  |  |
