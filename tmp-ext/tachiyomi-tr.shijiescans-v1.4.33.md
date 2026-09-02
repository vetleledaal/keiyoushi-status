# Extension Validation Report

- Extension: tachiyomi-tr.shijiescans-v1.4.33
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 876756264275379458
- Source name: Shijie Scans
- Source language: tr
- Selected manga input: latest offset 0: Home at the Horizon (`.../home-at-the-horizon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Nano Machine (`.../nano-machine`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Aşağı Dünyanın Efendisi (`.../asagi-dunyanin-efendisi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Home at the Horizon (`.../home-at-the-horizon`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Hua Dağı Mezhebinin Dönüşü (`.../return-of-the-mount-hua-sect`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Home at the Horizon (`.../home-at-the-horizon`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Home at the Horizon (`.../home-at-the-horizon`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | Bölüm 1 (`.../home-at-the-horizon-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 82 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Home at the Horizon, URL=`.../home-at-the-horizon` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://shijiescans.com/.../cc8fc160-8bde-4102-86e5-d9768f61e722.jpg.512-211x300.jpg` (image/jpeg, 22962 bytes, 211x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../home-at-the-horizon` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://shijiescans.com/.../cc8fc160-8bde-4102-86e5-d9768f61e722.jpg.512.jpg` (image/jpeg, 126866 bytes, 512x728) |  |  |  |
| details author | PASS | Taiyo Watabe |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Dram, Komedi, Psikolojik, Yaşamdan kesitler |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ryoma, bir sahil kasabasında büyükbabasıyla birlikte bir hamam işletmektedir. Bir gün okuldan sonra hamamı işletme rutinini sürdürürken, Reo adında bir çocuk ortaya çıkar ve babasının gayrimeşru oğlu olduğunu iddia eder. Hamamda üvey kardeşler arasında buruk ama yürek ısıtan bir dram yaşanır!<br><br>Alternative Names: Ufuktaki Ev, Okaeri Suiheisen, Welcome Back to the Horizon, おかえり水平線 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://shijiescans.com/.../00-27.webp` (image/webp (container: extended), 290546 bytes, 800x1200) |  |  |  |
