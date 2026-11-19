# Extension Validation Report

- Extension: tachiyomi-id.komikindoid-v1.6.3
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
- Source ID: 5384836574731339537
- Source name: KomikIndoID
- Source language: id
- Selected manga input: popular offset 0: Solo Leveling (`.../229848-solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Solo Leveling (`.../229848-solo-leveling`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Kingdom (`.../kingdom`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Re:teen - Mayu no Naka de Mou Ichido 10-dai no Kimi to Au (`.../reteen-mayu-no-naka-de-mou-ichido-10-dai-no-kimi-to-au`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Ultimate Romanticist (`.../the-ultimate-romanticist`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Leveling Up with Skills (`.../leveling-up-with-skills`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../229848-solo-leveling`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 183 | Chapter 0 (`.../solo-leveling-chapter-0`) |  | <1s |
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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Solo Leveling, URL=`.../229848-solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 124/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://komikindo.ch/.../komik-solo-leveling-236x319.jpg` (image/jpeg, 23258 bytes, 236x319) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../229848-solo-leveling` |  |  |  |
| details thumbnail URL | PASS | `https://komikindo.ch/.../komik-solo-leveling-236x319.jpg` |  |  |  |
| details author | PASS | h-goon (현군), Chugong (추공), Gi So-Ryeong (기소령) |  |  |  |
| details artist | PASS | REDICE Studio (레드아이스 스튜디오), Jang Sung-Rak (장성락) |  |  |  |
| details genres | PASS | Shounen, Magic, Monsters, Supernatural, Manhwa, Action, Adventure, Drama, Fantasy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Dunia diserang monster! Muncullah "hunter" untuk menyerang monster-monster itu. Di kalangan hunter, ada yang disebut hunter terlemah di dunia. Itulah julukan Seong Jinwoo. Masuk rumah sakit adalah kebiasaannya setelah masuk ke dungeon. Suatu hari, saat melakukan raid, suatu peristiwa tragis menimpanya. Peristiwa itu hampir merenggut nyawanya. Namun, saat tersadar, dia mendapati dirinya masih hidup dan melihat sesuatu yang tidak bisa dilihat orang lain. Sejak saat itu, kehidupan Seong Jinwoo berubah. Inilah perjalanan Seong Jinwoo untuk menjadi hunter terkuat di dunia!<br><br>Judul Alternatif: Na Honjaman Level-Up, 나 혼자만 레벨업, Na Honjaman Lebel-eob, I level up alone, Ore Dake Level Up na Ken, Поднятие уровня в одиночку, 俺だけレベルアップな件, 我独自升级, I am the only the one who levels up, 我獨自升級, Solo Adtritio, Yalnız Seviye Atlama, Sadece Ben Seviye Atlayabiliyorum, I Alone Level-Up, Jogador solo, Upando sozinho, Singur îmi ridic nivelul, Тільки я візьму новий рівень, سولو لولینگ, تکرو, केवल मैं स्तर बढ़ाता हूं, सोलो लेभलिङ, Aku Level Up Sendiri, Grinding Sendiri, Ben yanlız gelişirim, Tek başına seviye atlama, სოლო ლეველინგი, سولو ليفيلنغ, الإرتقاء بالمستوى منفردًا, 俺だけレベルアップな件〜外伝〜, সোলো লেভেলিং, שחקן בודד, सोलो लेवलिंग, Egyéni szintlépés, சோலோ லெவெலிங், Only I Level up, Tôi Thăng Cấp Một Mình, Solo Levelling, 나혼렙, Solo Leveling |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 183 chapters |  |  |  |
| chapter dates | PASS | 183 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://amatipolanyatirudesainnya.lol/.../wynMZz1zsTqCjNGXaCW4eO6C0MBraGlonhjoHdgu1vZXos9T4KDFovVAk9QWq4i4_001.jpg <redacted query values: mi_revision, mi_content_hash, mi_event, and mi_delivery>` (image/jpeg, 53129 bytes, 720x492) |  |  |  |
