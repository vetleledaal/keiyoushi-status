# Extension Validation Report

- Extension: tachiyomi-tr.toontaku-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 8871964332446395715
- Source name: Toontaku
- Source language: tr
- Selected manga input: popular offset 0: Öte Âlemin Zindan Hükümdarı (`.../ote-lemin-zindan-hukumdari`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Öte Âlemin Zindan Hükümdarı (`.../ote-lemin-zindan-hukumdari`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Evolution Begins With A Big Tree (`.../evolution-begins-with-a-big-tree`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 59 | Zindanları Boyayan Sanatçı (`.../zindanlari-boyayan-sanatci`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | Ne Bereketli Bir Hasat, İblis Kral! (`.../ne-bereketli-bir-hasat-iblis-kral`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Öte Âlemin Zindan Hükümdarı (`.../ote-lemin-zindan-hukumdari`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Öte Âlemin Zindan Hükümdarı (`.../ote-lemin-zindan-hukumdari`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 127 | Bölüm 0 (`.../019f3c37-3f15-74f0-b8e6-2716b02721e1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| latest listing | PASS | 59 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Öte Âlemin Zindan Hükümdarı, URL=`ote-lemin-zindan-hukumdari` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 168/168 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 168/168 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.toontaku.com/.../yiyubaojunwodeyingzinengwuxianjinhua-mengyuewenhua.jpg` (image/jpeg, 30847 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `ote-lemin-zindan-hukumdari` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.toontaku.com/.../yiyubaojunwodeyingzinengwuxianjinhua-mengyuewenhua.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Canavarlar, Aksiyon, Bilim Kurgu, Shounen, Sistem, Zindan, İntikam |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 2035 yılında, uzaylı alemlerine açılan yarıklar dünyanın savunmasını parçaladı. Böcek benzeri yaratıklar ve canavarlar sürüsü toprağı tahrip etti ve insanlık “Evolvers”ın gücüyle hayatta kalmak için mücadele etti. Li Yi, uzaylıların saldırısı sırasında takım arkadaşları tarafından ihanete uğradı ve ölüme terk edildi. Ölümün eşiğindeyken, “Titan Shadow” Sistemini uyandırdı — gölgesi sınırsız bir şekilde evrimleşebiliyordu! Savunmasını güçlendirmek için cevherleri yiyip bitirebilir, düşmanlarını parçalayarak ölümcül bıçaklar oluşturabilir ve hatta bir gölge asker ordusuna bölünebilirdi... Böcek kovanlarından hayaletli topraklara, gölgesinin geçtiği her yerde düşmanlar parçalanıp yok oluyordu. Bu, her şeyi yiyip bitiren bir gölgeyle başlayan zayıfların intikamıdır.<br><br>Alternatif isimler: Tyrant of the Otherworld Prison: My Shadow Can Evolve Infinitely, Tyrant of the Otherworld Prison, Shadow System: Harnessing Shadow Power to Become the Ultimate Hunter |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 127 chapters |  |  |  |
| chapter dates | PASS | 127 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.toontaku.com/.../001-522e.webp` (image/webp (encoding: lossy), 46444 bytes, 800x1396) |  |  |  |
