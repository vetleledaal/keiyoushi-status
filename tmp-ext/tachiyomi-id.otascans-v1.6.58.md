# Extension Validation Report

- Extension: tachiyomi-id.otascans-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
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
- Source ID: 2170345400165397182
- Source name: Ota Scans
- Source language: id
- Selected manga input: latest offset 0: Quiet in the Office! (`.../quiet-in-the-office`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Yandere Sister Just Wants Me to Bully Her (`.../the-yandere-sister-just-wants-me-to-bully-her`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Yuri no Hajimari wa Dorei Kara (`.../yuri-no-hajimari-wa-dorei-kara`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Quiet in the Office! (`.../quiet-in-the-office`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Kimi Meku Yoru ni Kogarete (`.../kimi-meku-yoru-ni-kogarete`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Quiet in the Office! (`.../quiet-in-the-office`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Quiet in the Office! (`.../quiet-in-the-office`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Chapter 86 (`.../chapter-86`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Quiet in the Office!, URL=`quiet-in-the-office` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yurilab.top/.../Please-Be-Quiet-in-the-Office-350x476.jpg` (image/jpeg, 25205 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `quiet-in-the-office` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yurilab.top/.../Please-Be-Quiet-in-the-Office.jpg` (image/jpeg, 99448 bytes, 736x1308) |  |  |  |
| details author | PASS | Kim Chacha |  |  |  |
| details artist | PASS | Hong Gwa |  |  |  |
| details genres | PASS | Comedy, Drama, Full Color, Josei, Mature, Not Yuri, Romance, Smut, Manhwa, Project |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Bagi Nayul yang malang, keseimbangan antara pekerjaan dan kehidupan pribadi hanyalah angan-angan belaka akibat ulah bosnya yang kejam, Sijin. Tak hanya terus-menerus memaksanya lembur, sikap Sijin itu juga membuat Nayul diputuskan oleh pacarnya. Muak dengan kelakuan Sijin yang keterlaluan, Nayul mendatangi kantor pria itu untuk meluapkan kekesalannya… namun malah memergoki Sijin sedang Coli! Meski awalnya pemandangan itu terasa menjijikkan, Nayul justru merasa terangsang. Entah bagaimana, ia akhirnya berhubungan intim dengan bosnya di atas meja kerja, yang berujung pada hubungan friends-with-benefits yang menjengkelkan namun penuh gairah. Namun, sampai kapan Nayul bisa menyembunyikan rahasia memalukan ini dari mantan pacarnya yang kepo dan rekan-rekan kerja yang gemar bergosip?<br><br>Alternative Names: Be Quiet and Don't Ever Smile in the Office, Chasteté au bureau, En la oficina, compórtate, I Say Please Be Quiet and Take Off Your "Something", Keine Unzucht am Arbeitsplatz!, บริษัทร้อนซ่อนรัก, 公司內請保持肅靜, 社内では静粛にシてください, 辦公室內請保持肅靜, 사내에서는 정숙할 것 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yurilab.top/.../01.jpg` (image/jpeg, 600075 bytes, 500x8953) |  |  |  |
