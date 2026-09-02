# Extension Validation Report

- Extension: tachiyomi-tr.tortugaceviri-v1.6.56
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1479830960881750685
- Source name: Tortuga Ceviri
- Source language: tr
- Selected manga input: popular offset 0: Berserk (`.../40`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Berserk (`.../40`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Green Blood (`.../105`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Record of Ragnarok (`.../593`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Ölüm Bizi Ayırana Dek (`.../90`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Berserk (`.../40`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Berserk (`.../40`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 403 | Berserk 0-01 (`.../berserk-0-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 95 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Berserk, URL=`40` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tortugaceviri.com/.../Manga_V43_Cover-350x476.webp` (image/webp (encoding: lossy), 37320 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `40` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tortugaceviri.com/.../Manga_V43_Cover-193x278.webp` (image/webp (encoding: lossy), 16028 bytes, 193x278) |  |  |  |
| details author | PASS | Kentaro Miura |  |  |  |
| details artist | PASS | Kentaro Miura |  |  |  |
| details genres | PASS | ベルセルク, Berserk the Prototype |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Guts idam edilmiş ölü bir kadından doğar ve rastlantıyla Gambino isimli bir paralı asker tarafından bulunur. Gambino, Guts’ı istemese de sevdiği kadının isteği üzerine onu evlat edinir. Guts, Gambino’nun paralı asker gurubunda bulunduğu süre içerisinde ondan kılıç kullanmayı öğrenir, ancak Gambino’nun sevdiği kadın ölür ve Gambino bunun nedenini Guts’ın uğursuzluğuna bağlar ve Guts’a karşı nefret beslemeye başlar. Bir gece sarhoşluğun etkisiyle Guts’a saldırır. Guts kendini kurtarmak için Gambino’yu öldürmek zorunda kalır… Cinayet işlediği için gruptan kaçan Guts, yıllar içerisinde deneyimli bir paralı asker olurr. Katıldığı bir kale kuşatması sırasında düşman birliğin kumandanlarından biri olan Bazuso’yu öldürür, fakat bu sırada kulenin tepesinden kendini izleyenlerden habersizdir. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 403 chapters |  |  |  |
| chapter dates | LINT | 263 of 403 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=263 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 95 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yedek.mangawow.com/.../00.jpg` (image/jpeg, 540525 bytes, 900x500) |  |  |  |
