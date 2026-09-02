# Extension Validation Report

- Extension: tachiyomi-id.lumoskomik-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2530259860313477889
- Source name: LumosKomik
- Source language: id
- Selected manga input: popular offset 0: All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I Robbed The Storehouse Of The God (`.../i-robbed-the-storehouse-of-the-god`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Chronicles Of The Demon Faction (`.../chronicles-of-the-demon-faction`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Margrave’s 10th-Class Scoundrel (`.../the-margraves-10th-class-scoundrel`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | All My Alter Egos Are Tycoons (`.../all-my-alter-egos-are-tycoons`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 80 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 199 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=All My Alter Egos Are Tycoons, URL=`all-my-alter-egos-are-tycoons` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=The Beginning After the End, URL=`honeypot-trap-xz9k2` at page 1 offset 24 and page 2 offset 24 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Tales of Demons and Gods, URL=`honeypot-trap-xz9k2` at page 1 offset 24 and page 2 offset 24 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lms.imgsvr.my.id/.../cover_PKADOY.webp` (image/webp (encoding: lossy), 36886 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `all-my-alter-egos-are-tycoons` |  |  |  |
| details thumbnail URL | PASS | `https://lms.imgsvr.my.id/.../cover_PKADOY.webp` |  |  |  |
| details author | PASS | LICO |  |  |  |
| details artist | PASS | 한사 |  |  |  |
| details genres | PASS | Action, Fantasy, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Pria muda, Han Sunghyun, kehilangan keluarganya dalam serangan superhuman tanpa pandang bulu. Selagi hidup menyendiri karena trauma, suatu hari, dia membangkitkan kemampuan untuk mengendalikan avatar di tempatnya! “Apa?! Aku bisa mengirim avatar berburu ke dunia lain yang berbahaya selagi aku santai-santai di rumah, hanya fokus memperkuat kekuatanku?!”
<br>Bersama dengan tumbuh pesat avatarnya, menyebrangi dimensi, ras, dan profesi, Hang Sunghyun mulai memburu superhuman yang menyalahgunakan kekuatan mereka! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 199 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lms.imgsvr.my.id/.../001_q-KV4b.webp` (image/webp (encoding: lossy), 135812 bytes, 800x1000) |  |  |  |
