# Extension Validation Report

- Extension: tachiyomi-tr.afroditscans-v1.4.36
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: uzaymanga
- Source ID: 4839000923958753250
- Source name: Afrodit Scans
- Source language: tr
- Selected manga input: popular offset 0: Çocuğum İçin Dayanmalıyım! (`.../cocugum-icin-dayanmaliyim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Çocuğum İçin Dayanmalıyım! (`.../cocugum-icin-dayanmaliyim`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 17 | Canavar Prenses (`.../canavar-prenses`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Yapmamalıyız (`.../yapmamaliyiz`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 17 | Kuzeyin Büyük Düşesi Gizli Bir Hain! (`.../kuzeyin-buyuk-dusesi-gizli-bir-hain`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Çocuğum İçin Dayanmalıyım! (`.../cocugum-icin-dayanmaliyim`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Çocuğum İçin Dayanmalıyım! (`.../cocugum-icin-dayanmaliyim`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 81 | Bölüm 1 (`.../1-bolum-oku`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 139 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Çocuğum İçin Dayanmalıyım!, URL=`.../cocugum-icin-dayanmaliyim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-a.efsaneler2.can.re/.../1702155852074___oda-gelmedi-ya.avif` (image/webp (encoding: lossy), 123442 bytes, 720x1030; server Content-Type: image/avif) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cocugum-icin-dayanmaliyim` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-a.efsaneler2.can.re/.../1702155852074___oda-gelmedi-ya.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Dram, Fantastik, Manhwa, Romantizm |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Şeytanla evlenecek bir kadının vücuduna zaten sahibim, kocasının ölümüne kadar peşinde olduğu bir rolde hem de. “Her zaman senin yanında olacağım!” Bu zavallı kocaya bir süreliğine iyi davranmaya karar verdim. Ama bir gün önce, Yetişkin olduğumda ve boşanmayı planladığımda, küçük bir melek sürprizlerle dolu bir gecede belirdi. Oh adamım. Bu yüzden, keşfedilmeden önce kaçmaya çalıştım… “Richard? Bir şeyler doğru değil.” ” Kaçmana izin verme niyetinde değilim, ölsen bile, kollarımda kalmalısın. Elisha” Ağlamaya ve tatlı bir suratla yalvarmaya çalışmak mümkün değil. ” Çocuğumuzu nereye götüreceksin?” Bu soğuk gözlerle beni kovaladı mı? …Sanırım bu şekilde kaçmam yanlıştı. Bu durumu nasıl çözmeli?<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | PASS | 81 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 139 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-a.efsaneler2.can.re/.../0.avif` (image/jpeg, 109793 bytes, 1200x800; server Content-Type: image/avif) |  |  |  |
