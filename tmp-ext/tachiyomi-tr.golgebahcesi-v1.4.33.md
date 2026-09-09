# Extension Validation Report

- Extension: tachiyomi-tr.golgebahcesi-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7442439989890509521
- Source name: Gölge Bahçesi
- Source language: tr
- Selected manga input: popular offset 0: Gölgelerdeki Hükümdar Olmak İstiyorum (`.../golgelerdeki-hukumdar-olmak-istiyorum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Gölgelerdeki Hükümdar Olmak İstiyorum (`.../golgelerdeki-hukumdar-olmak-istiyorum`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Kuduz Hançerin İntikamı (`.../kuduz-hancerin-intikami`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Kız Arkadaşım (`.../kiz-arkadasim`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Güç Yiyen Lord (`.../guc-yiyen-lord`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Gölgelerdeki Hükümdar Olmak İstiyorum (`.../golgelerdeki-hukumdar-olmak-istiyorum`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Gölgelerdeki Hükümdar Olmak İstiyorum (`.../golgelerdeki-hukumdar-olmak-istiyorum`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 92 | Bölüm 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gölgelerdeki Hükümdar Olmak İstiyorum, URL=`golgelerdeki-hukumdar-olmak-istiyorum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c2.skycdn.online/.../1788646553_8721509a4d972424b0cb7936cc703e13.webp` (image/webp (container: extended), 1704514 bytes, 1024x1535) |  |  |  |
| details identity | PASS | Details preserved selected URL `golgelerdeki-hukumdar-olmak-istiyorum` |  |  |  |
| details thumbnail URL | PASS | `https://c2.skycdn.online/.../1788646553_8721509a4d972424b0cb7936cc703e13.webp` |  |  |  |
| details author | PASS | Aizawa Daisuke / Sakano Anri |  |  |  |
| details artist | PASS | Sakano Anri |  |  |  |
| details genres | PASS | Aksiyon, Fantastik, Macera, Komedi, Ecchi, Harem, İsekai, Gölge Bahçesi, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Büyük kahramanlar ve şeytani kötü adamlar, insanların olmak için can attığı karakterlerdir. Ancak Cid Kagenou böyle biri değildir. Onun hayali, her şeyin arkasındaki gerçek beyin olmak; ipleri perde arkasından çekmek ve yaptığı planlarla tüm hikâyenin gidişatını belirlemektir. Modern Japonya'daki önceki hayatında hedeflerine ulaşmayı başaramamıştı. Fakat şimdi büyünün hüküm sürdüğü bir dünyada yeniden doğdu ve gölgelerin gerçek gücünü gösterecek!<br><br>Cid, sıradan bir figüranmış gibi davranırken, gizemli tarikatı ortadan kaldırmak amacıyla kendi (sahte) örgütü Shadow Garden'a üyeler toplamaya başlar. Cid'in doğaçlama uydurduğu hikâyelerle yönettiği bu (sahte) örgüt, gölgelerde saklanan kötü şöhretli Diablos Tarikatı'na karşı savaşmaya başlar. Ne var ki Cid'in tamamen uydurduğunu sandığı bu tarikat... şaşırtıcı bir şekilde gerçektir.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 92 chapters |  |  |  |
| chapter dates | LINT | All 92 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=92 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c2.skycdn.online/.../1.webp` (image/webp (encoding: lossy), 348912 bytes, 975x1400) |  |  |  |
