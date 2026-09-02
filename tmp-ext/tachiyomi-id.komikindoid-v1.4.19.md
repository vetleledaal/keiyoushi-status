# Extension Validation Report

- Extension: tachiyomi-id.komikindoid-v1.4.19
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5384836574731339537
- Source name: KomikIndoID
- Source language: id
- Selected manga input: popular offset 0: Solo Leveling (`.../229848-solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Solo Leveling (`.../229848-solo-leveling`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Kingdom (`.../kingdom`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Leu Leu Leu (`.../leu-leu-leu`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Yuusha Party wo Kubi ni Natta node Kokyou ni Kaettara, Member Zenin ga Tsuitekitandaga (`.../yuusha-party-wo-kubi-ni-natta-node-kokyou-ni-kaettara-member-zenin-ga-tsuitekitandaga`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 6 | Leveling Up with Skills (`.../leveling-up-with-skills`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Leveling (`.../229848-solo-leveling`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 182 | Chapter 1 (`.../solo-leveling-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 2: title=Solo Leveling, URL=`.../229848-solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 126/126 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 125/126 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://komikindo.ch/.../Komik-Solo-Leveling-236x319.jpeg` (image/jpeg, 23803 bytes, 236x319) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../229848-solo-leveling` |  |  |  |
| details thumbnail URL | PASS | `https://komikindo.ch/.../Komik-Solo-Leveling-236x319.jpeg` |  |  |  |
| details author | PASS |  Chugong 추공 |  |  |  |
| details artist | PASS |  Jang Sung-Rak (REDICE Studio) |  |  |  |
| details genres | PASS | Shounen, Magic, Monsters, Manhwa, Action, Adventure, Fantasy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 10 tahun yang lalu, setelah "Gerbang" yang menghubungkan dunia nyata dengan dunia monster terbuka, beberapa orang biasa, setiap hari menerima kekuatan untuk berburu monster di dalam Gerbang. Mereka dikenal sebagai "Pemburu". Namun, tidak semua Pemburu kuat. Nama saya Sung Jin-Woo, seorang Pemburu peringkat-E. Saya seseorang yang harus mempertaruhkan nyawanya di ruang bawah tanah paling rendah, "Terlemah di Dunia". Tidak memiliki keterampilan apa pun untuk ditampilkan, saya hampir tidak mendapatkan uang yang dibutuhkan dengan bertarung di ruang bawah tanah berlevel rendah… setidaknya sampai saya menemukan ruang bawah tanah tersembunyi dengan kesulitan tersulit dalam ruang bawah tanah peringkat-D! Pada akhirnya, saat aku menerima kematian, tiba-tiba aku menerima kekuatan aneh, log pencarian yang hanya bisa kulihat, rahasia untuk naik level yang hanya aku yang tahu! Jika saya berlatih sesuai dengan pencarian saya dan monster yang diburu, level saya akan naik. Berubah dari Hunter terlemah menjadi Hunter S-rank terkuat!<br><br>Judul Alternatif: Aku Level Up Sendiri, Ben yanlız gelişirim, Grinding Sendiri, I Alone Level Up, I Alone Level-Up, I Level Up Alone, Na Honjaman Level Up, Na Honjaman Rebereop, Only I Level Up, Singur Îmi Ridic Nivelul, SL, Solo Levelling, Tek Başına Seviye Atlamak, Поднятие уровня в одиночку, الإرتقاء بالمستوى منفردًا, سولو لولینگ, سولو ليفيلنغ, من به تنهایی لول‌آپ می‌کنم, 俺だけレベルアップな件, 我独自升级, 나 혼자만 레벨업 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: artist, author |  |  |  |
| chapters | PASS | 182 chapters |  |  |  |
| chapter dates | PASS | 182 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imageainewgeneration.lol/.../eG6WiHd9Woz1fyC001.jpg` (image/jpeg, 795047 bytes, 1124x768) |  |  |  |
